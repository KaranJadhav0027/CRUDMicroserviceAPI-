# CURD Microservice API

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

---
## 📡 API Endpoints

    Method	Endpoint	Description
    GET	/api/batches	Get all batch entries
    GET	/api/batches/{id}	Get batch by ID
    POST	/api/batches	Create new batch entry
    PUT	/api/batches/{id}	Update batch entry
    DELETE	/api/batches/{id}	Delete batch entry

---

## 🧪 Health Check

   -Backend health check endpoint:
    
    GET /health
---

## 👨‍💻 Author

    
    -Karan Jadhav
    📧 karanjadhav0027@gmail.com
     
---
