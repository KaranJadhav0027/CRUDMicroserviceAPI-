# Batch Management System

A full-stack web application for managing batch entries, built with **React (Vite)** for the frontend and **Spring Boot + MongoDB** for the backend.  
It provides CRUD functionality to add, edit, view, and delete batch records with name and fees details.

---

## 🚀 Features
- View all batch entries
- Add a new batch entry
- Edit an existing batch entry
- Delete a batch entry
- RESTful API with JSON responses
- Responsive and modern UI

---

## 🛠 Tech Stack
**Frontend:**
- React (Vite)
- React Router
- Axios
- Bootstrap / Custom CSS

**Backend:**
- Spring Boot
- Spring Web
- Spring Data MongoDB
- Java 17+

**Database:**
- MongoDB

---

## 📂 Project Structure
    project-root/
    │── backend/
    │ ├── src/main/java/com/example/demo/
    │ │ ├── BatchEntry.java
    │ │ ├── BatchEntryController.java
    │ │ ├── BatchEntryRepository.java
    │ │ ├── BatchEntryService.java
    │ │ └── HealthCheck.java
    │── frontend/
    │ ├── src/components/
    │ │ ├── AddStudent.jsx
    │ │ ├── EditStudent.jsx
    │ │ └── StudentList.jsx
    │ ├── App.jsx
    │ ├── App.css
    │ └── api/studentService.js
    
### Backend (Spring Boot)

  cd backend
  # Configure MongoDB connection in application.properties
  mvn clean install
  mvn spring-boot:run

##Frontend (React + Vite)
  cd frontend
  npm install
  npm run dev
