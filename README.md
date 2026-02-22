#  JobApp Backend – Spring Boot REST API

A RESTful backend application built using **Spring Boot** that performs full CRUD (Create, Read, Update, Delete) operations for managing job postings.

This project demonstrates clean layered architecture and REST API development using Java and Spring Boot.

---

## Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Maven
- Postman (API Testing)

---

##  Project Structure

com.example.demo
│
├── JobAppApplication.java
│
├── controller
│ └── JobRestController.java
│
├── service
│ └── JobService.java
│
├── repo
│ └── JobRepo.java
│
└── model
└── JobPost.java


---

##  Architecture

The application follows a layered architecture:

Client (Postman) -> Controller Layer ->  Service Layer -> Repository Layer -> In-Memory Data Storage (ArrayList)  

---

##  API Endpoints

###  1. Get All Jobs
Returns all available job postings.

---

###  2. Get Job By ID
Returns a specific job by its ID.

---

###  3. Add New Job
#### Sample Request Body:
```json
{
  "postId": 6,
  "postProfile": "Backend Engineer",
  "postDesc": "Design backend systems",
  "reqExperience": 3,
  "postTechStack": ["Spring Boot", "Java", "SQL"]
}
```
## Key Concepts Implemented

@RestController

@GetMapping

@PostMapping

@PutMapping

@DeleteMapping

@RequestBody

@PathVariable

Dependency Injection using @Autowired

Layered Architecture Design
