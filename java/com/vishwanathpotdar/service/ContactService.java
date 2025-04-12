package com.vishwanathpotdar.service;

import org.springframework.stereotype.Service;

import com.vishwanathpotdar.entity.Contact;
import com.vishwanathpotdar.repository.ContactRepository;

import lombok.RequiredArgsConstructor;

//src/main/java/com/yourname/service/ContactService.java
@Service
public class ContactService {
    private final ContactRepository contactRepo;

    public ContactService(ContactRepository contactRepo) {
        this.contactRepo = contactRepo;
    }

    public Contact saveContact(Contact contact) {
        return contactRepo.save(contact);
    }
}
