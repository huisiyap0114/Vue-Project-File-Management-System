# Vue + Spring Boot File Management System

This is a full-stack file management web application built with **Vue.js** for the frontend and **Spring Boot** for the backend. It allows users to upload, preview, and delete files through a clean, modern interface.

**Date submitted**: 7th August 2025

---

## ✨ Features

- Upload files via web UI  
- List all uploaded files  
- Delete unwanted files  
- File preview support  
- Organized into frontend and backend folders  

---

## 🧰 Tech Stack

- **Frontend**: Vue 3 + Vite  
- **Backend**: Spring Boot + Java  
- **Database**: MySQL  
- **Build Tool**: Maven  

---

## 📁 Project Structure

- `/client` – Vue.js frontend (Vite)  
- `/server` – Spring Boot backend (Maven)  
- `README.md` – Project documentation  

---

## ⚙️ Prerequisites

Before running the project, make sure you have:

- Java JDK  
- Maven  
- Node.js  
- MySQL  

---

## 🚀 Installation & Setup

## 1. Clone the repository

- git clone https://github.com/huisiyap0114/Vue-Project-File-Management-System

- cd file-management-notes-app

---

## 2. Navigate to backend folder

-  cd backend

---
   
## 3. Configure MySQL (Backend)

- CREATE DATABASE notesdb 

- Update application.propertities with your DB credentials

---   
## 4. Build and Run the backend

-mvn clean install

-mvn spring-boot:run

--- 
## 5. Install dependencies (Frontend)

-cd frontend

-npm install

-npm run dev

---
## 6.Running the project 

The client will run on http://localhost:5173 while the server will run on
    http://localhost:8080 by default.
