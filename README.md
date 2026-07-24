<div align="center">

# 🎬 Movie Ticket Reservation System

### Production-Ready Spring Boot REST API for Movie Ticket Booking

A secure and scalable backend application built with **Spring Boot 3**, **Spring Security**, **JWT Authentication**, **Spring Data JPA**, and **PostgreSQL**. This project provides RESTful APIs for user authentication, movie management, show scheduling, and ticket booking while following modern enterprise backend development practices.

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.0-brightgreen?style=for-the-badge&logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge&logo=postgresql&logoColor=white)
![JWT](https://img.shields.io/badge/Security-JWT-black?style=for-the-badge&logo=jsonwebtokens&logoColor=white)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

</div>

---

# 📖 Table of Contents

- [About the Project](#about-the-project)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Architecture](#architecture)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Documentation](#api-documentation)
- [Authentication](#authentication)
- [API Endpoints](#api-endpoints)
- [Project Highlights](#project-highlights)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [Author](#author)
- [License](#license)

---

# About the Project

The **Movie Ticket Reservation System** is a backend REST API developed using **Spring Boot** that enables users to browse movies, manage shows, and book tickets securely.

The application demonstrates enterprise backend development practices including:

- RESTful API Development
- JWT Authentication
- Spring Security
- Layered Architecture
- PostgreSQL Database Integration
- Spring Data JPA (Hibernate)
- Exception Handling
- Swagger API Documentation

This project can serve as the backend for:

- 🎬 Movie Booking Website
- 📱 Mobile Application
- 💻 Desktop Client
- 🎓 Academic Project
- 💼 Java Backend Portfolio

---

# Features

- 🔐 JWT-Based Authentication & Authorization
- 👤 User Registration and Login
- 🎬 Movie Management
- 🎭 Show Management
- 🎟 Ticket Booking
- 🗄 PostgreSQL Integration
- ⚡ RESTful API Design
- 📄 Swagger/OpenAPI Documentation
- 🛡 Spring Security
- 🔄 Layered Architecture
- ✅ Input Validation
- ⚠ Global Exception Handling

---

# Technology Stack

| Category | Technology |
|----------|------------|
| Language | Java 17 |
| Framework | Spring Boot 3 |
| Security | Spring Security + JWT |
| Database | PostgreSQL |
| ORM | Spring Data JPA (Hibernate) |
| Build Tool | Maven |
| Documentation | Swagger / OpenAPI |
| Utilities | Lombok |

---

# Architecture

```
                Client Application
                        │
                HTTP Requests (REST)
                        │
            Spring Security + JWT Filter
                        │
                Controller Layer
                        │
                 Service Layer
                        │
               Repository Layer
                        │
                  PostgreSQL Database
```

The application follows a **Layered Architecture**, ensuring clear separation of concerns, maintainability, scalability, and clean code organization.

---

# Project Structure

```
Movie-Ticket-Reservation-System
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── config
│   │   │   ├── controller
│   │   │   ├── dto
│   │   │   ├── entity
│   │   │   ├── exception
│   │   │   ├── repository
│   │   │   ├── security
│   │   │   ├── service
│   │   │   └── MovieTicketReservationApplication.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

# Prerequisites

Before running the application, make sure you have:

- Java 17 or later
- Maven 3.8+
- PostgreSQL 13+
- Git
- IntelliJ IDEA / VS Code

---

# Getting Started

## Clone the Repository

```bash
git clone https://github.com/Dhirajmerit/Movie-Ticket-Reservation-System.git

cd Movie-Ticket-Reservation-System
```

---

## Build the Project

### Windows

```bash
mvnw.cmd clean install
```

### Linux / macOS

```bash
./mvnw clean install
```

---

# Configuration

Update the database configuration in

```
src/main/resources/application.properties
```

Example:

```properties
# Database Configuration

spring.datasource.url=jdbc:postgresql://localhost:5432/movie_booking

spring.datasource.username=postgres

spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

# JWT Configuration

jwt.secret=your_secret_key

jwt.expiration=3600000
```

> **Note:** Never commit database credentials or JWT secrets to a public repository. Use environment variables or external configuration for production deployments.

---

# Running the Application

Run the application using Maven.

```bash
./mvnw spring-boot:run
```

or

```bash
mvnw.cmd spring-boot:run
```

Once started, the application will be available at

```
http://localhost:8080
```

---

# API Documentation

Swagger UI is available after the application starts.

```
http://localhost:8080/swagger-ui/index.html
```

Swagger provides interactive API documentation, allowing developers to explore and test all available endpoints directly from the browser.

---
