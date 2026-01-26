# 🍽️ Foodies Backend – Online Food Ordering System

This repository contains the backend service for Foodies, a full-stack online food ordering platform. The backend is built using Java and Spring Boot and provides secure REST APIs for authentication, cart management, and order processing.

---

## 🚀 Features

- User & Admin authentication using JWT
- Role-based access control (RBAC)
- Secure REST APIs with Spring Security
- Cart and order management
- Admin APIs for menu & order handling
- Global exception handling & validation
- Clean layered architecture

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Security + JWT
- Spring Data JPA
- MongoDB
- Maven
- REST APIs

---

## 📁 Project Structure

controller/   → REST endpoints  
service/      → Business logic  
repository/   → Database access layer  
model/        → Entities  
security/     → JWT config & filters  
exception/    → Global error handling  

---

## ⚙️ How to Run Locally

1. Clone the repository  
   git clone https://github.com/ayushcode12/Foodies_Backend.git

2. Configure database in application.properties

3. Run the application  
   mvn spring-boot:run

4. Server starts at  
   http://localhost:8080

---

## 🔐 Authentication Flow

- Login returns JWT token
- Token is sent in Authorization header
- Access is controlled based on role (USER / ADMIN)

---

## 📌 What I Learned

- Secure REST API development
- JWT authentication & authorization
- Backend architecture design
- Database modeling
- Error handling and validation
- Building production-like systems

---

## 👨‍💻 Author

Ayush Jain  
Java Backend / Full Stack Developer  
GitHub: https://github.com/ayushcode12
