# Vue + Spring Boot File Management System

This is a full-stack file management web application built with **Vue.js** for the frontend and **Spring Boot** for the backend. It allows users to upload, preview, and delete files through a clean, modern interface.

Date submitted: 7th August 2025
---

## Features

- Upload files via web UI
- List all uploaded files
- Delete unwanted files
- File preview support
- Organized into frontend and backend folders

---
## Tech Stack

- **Frontend**: Vue 3 + Vite
- **Backend**: Spring Boot + Java
- **Database**: MySQL
- **Build Tool**: Maven

---
## Project Structure
-client/ Vue.js frontend (Vite)
-server / Spring Boot backend (Maven)
-README.md/ Project Documentation

---
## Installation
To run the project locally, please follow these steps: 
---
## Prerequisites
-Java JDK
-Maven
-Node.js
-MysQL

Setup
1. Clone the repository
   https://github.com/huisiyap0114/Vue-Project-File-Management-System
2. Navigate to backend folder
   cd server
3. Configure MySQL (Backend)
   -CREATE DATABASE file_management_system
   -Update application.propertities with your DB credentials
4. Build and Run the backend
   mvn clean install
   mvn spring-boot:run
5. Install dependencies (Frontend)
   -Navigate to Frontend Folder
   npm install
   npm run dev
6. The client will run on http://localhost:5173 while the server will run on
   http://localhost:8080 by default.
