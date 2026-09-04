# ✈️ Flight Booking System API

A RESTful Flight Booking System API built using **Java** and **Spring Boot**. The application provides backend services for managing flights, passengers, reservations, and bookings through clean and structured REST endpoints.

The project demonstrates practical backend development concepts including REST API design, layered architecture, database integration, validation, exception handling, and scalable application development.

---

## 🚀 Features

* Create and manage flight information
* Search and retrieve available flights
* Create flight bookings
* Manage passenger information
* Retrieve booking details
* Update booking information
* Cancel bookings
* Input validation
* Global exception handling
* Database integration
* Structured REST API architecture
* Clean separation between controller, service, repository, and model layers

---

## 🛠️ Technologies Used

* **Java**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **REST API**
* **Maven**
* **MySQL / PostgreSQL** *(update based on your database)*
* **Postman** for API testing
* **Git & GitHub**

---

## 🏗️ Project Architecture

The application follows a layered architecture to improve maintainability and scalability.

```text
src/main/java
│
├── controller
│   └── Handles incoming HTTP requests
│
├── service
│   └── Contains application and business logic
│
├── repository
│   └── Handles database operations
│
├── model / entity
│   └── Contains database entities
│
├── dto
│   └── Request and response objects
│
├── exception
│   └── Custom and global exception handling
│
└── config
    └── Application configuration
```

---

## 📌 API Functionalities

### Flight Management

The Flight API can be used to:

* Add new flights
* Retrieve all flights
* Retrieve a flight by ID
* Search for available flights
* Update flight information
* Delete flights

Example endpoints:

```http
GET /api/flights
GET /api/flights/{id}
POST /api/flights
PUT /api/flights/{id}
DELETE /api/flights/{id}
```

---

### Booking Management

The Booking API provides functionality to create and manage flight reservations.

Example endpoints:

```http
GET /api/bookings
GET /api/bookings/{id}
POST /api/bookings
PUT /api/bookings/{id}
DELETE /api/bookings/{id}
```

---

### Passenger Management

Passenger-related endpoints can be used to maintain passenger information associated with bookings.

Example:

```http
GET /api/passengers
GET /api/passengers/{id}
POST /api/passengers
PUT /api/passengers/{id}
DELETE /api/passengers/{id}
```

> Update the endpoints above to match the endpoints implemented in your project.

---

## 📦 Example Booking Request

```json
{
  "flightId": 101,
  "passengerName": "John Doe",
  "email": "john@example.com",
  "phoneNumber": "9876543210",
  "numberOfSeats": 1
}
```

### Example Response

```json
{
  "bookingId": 1001,
  "flightId": 101,
  "passengerName": "John Doe",
  "status": "CONFIRMED"
}
```

---

## ⚙️ Getting Started

### Prerequisites

Make sure the following are installed on your machine:

* Java 17 or later
* Maven
* MySQL or PostgreSQL
* Git
* Postman *(optional, for API testing)*

---

## 📥 Clone the Repository

```bash
git clone https://github.com/your-username/flight-booking-system.git
```

Navigate into the project directory:

```bash
cd flight-booking-system
```

---

## 🗄️ Database Configuration

Update the `application.properties` file with your database configuration.

Example using MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/flight_booking
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Create the database before starting the application:

```sql
CREATE DATABASE flight_booking;
```

> Never commit real database passwords, API keys, or other sensitive credentials to GitHub.

---

## ▶️ Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or build the project first:

```bash
mvn clean install
```

Then run:

```bash
java -jar target/your-project-name.jar
```

By default, the application should be available at:

```text
http://localhost:8080
```

---

## 🧪 API Testing

You can test the API using tools such as:

* Postman
* Insomnia
* Swagger UI
* cURL

Example request:

```bash
curl http://localhost:8080/api/flights
```

---

## ✅ Validation & Error Handling

The application can handle invalid requests using Spring Boot validation and centralized exception handling.

Example error response:

```json
{
  "timestamp": "2026-09-04T10:30:00",
  "status": 404,
  "error": "Not Found",
  "message": "Flight not found",
  "path": "/api/flights/999"
}
```

This provides consistent and understandable API responses for client applications.

---

## 🔐 Security

For production deployments, security can be enhanced using:

* Spring Security
* JWT authentication
* Role-based access control
* Environment variables for credentials
* HTTPS
* API rate limiting

---

## ☁️ Future Improvements

Planned or possible improvements include:

* JWT-based authentication and authorization
* User registration and login
* Role-based access for administrators and customers
* Seat selection
* Payment gateway integration
* Email booking confirmations
* Flight cancellation and refund management
* Swagger / OpenAPI documentation
* Docker containerization
* CI/CD pipeline
* AWS deployment
* Redis caching
* Automated unit and integration testing
* Microservices architecture

---

## 🎯 Project Objective

The purpose of this project is to demonstrate the development of a production-style backend application using Spring Boot and RESTful APIs.

It focuses on applying software engineering best practices including:

* Clean code
* Object-oriented programming
* REST API design
* Database management
* Layered architecture
* Exception handling
* Validation
* Maintainability
* Scalability

---

## 👨‍💻 Author

**Your Name**

Software Engineer | Java | Spring Boot | React | Python | Machine Learning | Generative AI | AWS

GitHub: `https://github.com/jahnavi-chagantipati-63`

LinkedIn: `https://www.linkedin.com/in/jahnavi-chagantipati-70a064383/`

---

## ⭐ Support

If you find this project useful, consider giving the repository a ⭐.

Contributions, suggestions, and feedback are welcome.
