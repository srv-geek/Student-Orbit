# Student Orbit

## Project Overview
Student Orbit is a **Spring Boot REST API** project designed to streamline the process of managing student attendance in educational institutions. The system allows faculty members to efficiently record attendance for specific subjects and provides interfaces for viewing and managing these records. The project eliminates paperwork, improves accuracy, and simplifies attendance tracking.

## Objectives
- **Automate Attendance Tracking:** Provide a REST API to streamline attendance management and integration with existing educational systems.
- **Ensure Data Accuracy:** Automate validation and secure storage of attendance records to minimize errors.
- **Seamless Integration:** Enable smooth integration with educational platforms to enhance faculty and administrative workflows.

## Scope
The **SamsTrack** project focuses on developing a **REST API** to handle student attendance, covering essential functionalities related to:
- **Students**
- **Subjects**
- **Faculty**
- **Attendance Records**

## Tech Stack
- **Backend:** Spring Boot, Java
- **Database:** MySQL/PostgreSQL (or any relational database)
- **ORM:** Hibernate/JPA
- **Security:** Spring Security (if authentication is implemented)
- **Build Tool:** Maven/Gradle

## Controllers
The project consists of the following controllers:

### 1. User Controller
- Manages user authentication and role-based access.
- Handles user registration and login functionalities.

### 2. Student Controller
- CRUD operations for student management (create, read, update, delete).
- Fetch student details.

### 3. Subject Controller
- Manages subjects and their assignments to students.
- Allows faculty to add or modify subject details.

### 4. Student Attendance Controller
- Handles attendance marking and retrieval.
- Tracks student attendance records and provides reports.

## Installation and Setup
### Prerequisites:
- Java 17+
- Maven or Gradle
- MySQL/PostgreSQL database setup

### Steps:
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repository/student-orbit.git
   ```
2. Navigate to the project directory:
   ```sh
   cd student-orbit
   ```
3. Configure database connection in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_orbit
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
4. Build and run the project:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
| Controller | Method | Endpoint | Description |
|------------|--------|----------|-------------|
| User Controller | `POST` | `/api/users/register` | Register a new user |
| User Controller | `POST` | `/api/users/login` | User login |
| Student Controller | `GET` | `/api/students` | Fetch all students |
| Student Controller | `POST` | `/api/students` | Add a new student |
| Subject Controller | `GET` | `/api/subjects` | Retrieve subjects |
| Subject Controller | `POST` | `/api/subjects` | Add a new subject |
| Student Attendance Controller | `POST` | `/api/attendance` | Mark attendance |
| Student Attendance Controller | `GET` | `/api/attendance/{studentId}` | Get attendance records for a student |

## Contribution
Feel free to contribute to this project by submitting a pull request or reporting issues.

## License
This project is licensed under the **MIT License**.

## Contact
For any queries or support, please reach out to:
- **Email:** vermashubham.srv@gmail.com
- **GitHub:** [srv-geek](https://github.com/srv-geek)

---
Happy Coding! 🚀

