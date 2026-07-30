# 🩸 Blood Bank Management System

A Blood Bank Management System developed using **Java Spring Boot**, **Spring Security**, **Hibernate (JPA)**, and **MySQL**. This application helps manage blood donors, hospitals, donation records, and users through secure REST APIs.

> **Note:** This project was originally developed as a learning project and has been uploaded to GitHub for version control and portfolio purposes.

---

## 🚀 Features

- User Authentication & Authorization
- Role-Based Access Control (Admin/User)
- Donor Management (CRUD)
- Hospital Management (CRUD)
- Donation Record Management
- Secure Password Encryption
- RESTful APIs
- MySQL Database Integration
- Spring Data JPA (Hibernate)
- Exception Handling
- Layered Architecture

---

## 🛠️ Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA (Hibernate)

### Database
- MySQL

### Build Tool
- Maven

### API Testing
- Postman

### IDE
- IntelliJ IDEA

---

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   ├── controller
│   │   ├── service
│   │   ├── repository
│   │   ├── entity
│   │   ├── config
│   │   ├── security
│   │   └── BloodBankApplication.java
│   └── resources
│       ├── application.properties
│       └── static
└── test
```

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/Chavda-Ravi/Blood-Bank.git
```

### Navigate to Project

```bash
cd Blood-Bank
```

### Configure Database

Create a MySQL database.

```sql
CREATE DATABASE bloodbank;
```

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bloodbank
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run the Project

```bash
mvn spring-boot:run
```

or run the main class from IntelliJ IDEA.

---

## 🔐 Authentication

The project uses **Spring Security**.

Authentication is required before accessing protected endpoints.

---

## 📮 REST API Modules

### Donor API

- Add Donor
- Get All Donors
- Get Donor by ID
- Update Donor
- Delete Donor

### Hospital API

- Add Hospital
- Get All Hospitals
- Update Hospital
- Delete Hospital

### Donation Record API

- Add Donation
- View Donations
- Update Donation
- Delete Donation

### User API

- Register User
- Login
- Manage Users (Admin)

---

## 💻 Tools Used

- IntelliJ IDEA
- Postman
- MySQL Workbench
- Git
- GitHub

---



## 📈 Future Improvements

- Email Notifications
- Blood Stock Management
- Search & Filter
- Dashboard with Charts
- JWT Authentication
- Swagger API Documentation
- Docker Support
- Cloud Deployment

---

## 🎯 Learning Outcomes

Through this project, I learned:

- Spring Boot Development
- REST API Design
- Spring Security
- Hibernate (JPA)
- MySQL Integration
- Maven Project Structure
- CRUD Operations
- Layered Architecture
- Git & GitHub

---

## 👨‍💻 Author

**Ravi Chavda**

GitHub:
https://github.com/Chavda-Ravi



---

## ⭐ Support

If you find this project helpful, consider giving it a ⭐ on GitHub.
