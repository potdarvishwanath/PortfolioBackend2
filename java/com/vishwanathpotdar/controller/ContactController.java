// src/main/java/com/vishwanathpotdar/controller/ContactController.java
package com.vishwanathpotdar.controller;

import com.vishwanathpotdar.entity.Contact;
import com.vishwanathpotdar.model.ContactForm;
import com.vishwanathpotdar.service.ContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<?> submitForm(@Valid @RequestBody ContactForm contactForm, 
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            bindingResult.getFieldErrors().forEach(error -> 
                errors.put(error.getField(), error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(errors);
        }
        
        Contact contact = new Contact();
        contact.setName(contactForm.getName());
        contact.setEmail(contactForm.getEmail());
        contact.setMessage(contactForm.getMessage());
        
        contactService.saveContact(contact);
        return ResponseEntity.ok("Message received and stored!");
    }
}
