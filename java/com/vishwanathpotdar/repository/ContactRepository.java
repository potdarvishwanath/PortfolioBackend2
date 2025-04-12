// src/main/java/com/vishwanathpotdar/repository/ContactRepository.java
package com.vishwanathpotdar.repository;

import com.vishwanathpotdar.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {}