package com.vishwanathpotdar.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContactForm {
    @NotBlank(message = "Name is required")
    private String name;
    
    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;
    
    @NotBlank(message = "Message is required")
    private String message;

	public ContactForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactForm(@NotBlank(message = "Name is required") String name,
			@Email(message = "Invalid email format") @NotBlank(message = "Email is required") String email,
			@NotBlank(message = "Message is required") String message) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
}