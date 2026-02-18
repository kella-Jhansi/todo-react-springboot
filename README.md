
A simple Full Stack Todo Application** built using Spring Boot for the backend and React for the frontend.  
This project demonstrates REST APIs, CRUD operations, and frontend–backend integration.

🚀 Features

- Add new todos
- View all todos
- Delete todos
- REST API using Spring Boot
- React frontend using Axios
- H2 in-memory database

🛠️ Tech Stack

 Backend
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven Wrapper

 Frontend
- React
- JavaScript
- Axios
- CSS

---

 📂 Project Structure
todo-react-springboot/
│
├── todo/ # Spring Boot Backend
│
├── todo-frontend/ # React Frontend
│
└── .gitignore

---

 ⚙️ Prerequisites

Ensure you have the following installed:

- Java 17 or higher
- Node.js (v16+)
- npm
- Git

Check versions:
bash
java -version
node -v
npm -v
How to Run the Project
🔹 Step 1: Run Backend (Spring Boot)
Open terminal and run:
cd todo
.\mvnw.cmd spring-boot:run
✅ Backend will start at:
http://localhost:8080
Test Backend API:
Open browser:
http://localhost:8080/api/todos
Step 2: Run Frontend (React)
Open another terminal and run:
cd todo-frontend
npm start
✅ Frontend will start at:
http://localhost:3000

🔗 API Endpoints
| Method | Endpoint        | Description   |
| ------ | --------------- | ------------- |
| GET    | /api/todos      | Get all todos |
| POST   | /api/todos      | Add new todo  |
| DELETE | /api/todos/{id} | Delete todo   |

🗄️ H2 Database Console
URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:todo-db
Username: sa
Password: (empty)
📌 Future Enhancements
Update todo
Mark todo as completed
Authentication & Authorization
Persistent database (MySQL/PostgreSQL)
Improved UI

👩‍💻 Author

Jhansi (kella-Jhansi)
GitHub: https://github.com/kella-Jhansi















