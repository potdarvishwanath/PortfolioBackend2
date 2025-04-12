Overview
This repository contains my personal portfolio website showcasing my skills, experience, projects, and education as a Java Full-Stack Developer. The portfolio features a responsive design with light/dark mode toggle, animated elements, and a contact form connected to a Spring Boot backend.

Features
Frontend
Responsive Design: Works on all device sizes

Dark/Light Mode: Toggleable theme with localStorage persistence

Animations: Scroll-triggered and hover animations

Interactive Elements:

Smooth scrolling navigation

Back-to-top button

Animated background elements

Particle.js effects

Contact Form: Connected to Spring Boot backend

Backend (Spring Boot)
CORS Configuration: Secure cross-origin requests

Security: Permissive security configuration for development

Contact API: Endpoint to receive and store contact messages

Validation: Server-side validation for contact form

Technologies Used
Frontend
HTML5, CSS3, JavaScript

Font Awesome icons

Google Fonts (Poppins, Roboto Mono)

Animate.css

Particles.js

Backend
Java 17

Spring Boot 3.x

Spring Web MVC

Spring Data JPA

Hibernate

MySQL (or your database of choice)

Lombok


portfolio/
├── frontend/
│   ├── index.html          # Main HTML file
│   ├── css/
│   │   └── styles.css      # All CSS styles
│   └── js/
│       └── script.js       # All JavaScript functionality
└── backend/
    ├── src/main/java/com/vishwanathpotdar/
    │   ├── config/         # Configuration classes
    │   ├── controller/      # REST controllers
    │   ├── entity/          # JPA entities
    │   ├── repository/      # Spring Data repositories
    │   ├── service/         # Business logic
    │   └── PortfolioBackend2Application.java  # Main class
    └── src/main/resources/  # Application properties


    
