# 🦸‍♀️ Iron Lady – AI & Technology Platform

Iron Lady is a full-stack web application built to support AI & technology–driven programs, learning modules, and interactive features for users. The project follows clean backend architecture with Spring Boot and a structured frontend, making it scalable, secure, and production-ready.

---

## 🚀 Features

* ✅ Program management (admin-added programs only)
* 🤖 AI-powered interaction (chat interface)
* 🌐 RESTful backend APIs
* 🗄️ Database integration with MySQL / H2
* 🎨 Clean UI with HTML, CSS, JavaScript
* 🔐 Secure and modular backend structure
* 📦 Maven-based build system

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate
* Maven

### Frontend

* HTML5
* CSS3
* JavaScript

### Database

* MySQL (Production)
* H2 (Development / Testing)

### Tools & IDE

* IntelliJ IDEA
* Git & GitHub
* Postman

---

## 📁 Project Structure

```
IronLady/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ironlady/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       └── model/
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── chat.html
│   │       │   └── programs.html
│   │       └── application.properties
│   └── test/
├── pom.xml
├── .gitignore
└── README.md
```

---

## ⚙️ Setup & Run Locally

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/iron-lady-app.git
cd iron-lady-app
```

### 2️⃣ Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ironlady
spring.datasource.username=root
spring.datasource.password=your_password
```

(You can also use H2 for quick testing.)

---

### 3️⃣ Run the application

```bash
mvn spring-boot:run
```

Access the app at:

```
http://localhost:8080
```

---

## 🔒 Git Ignore Rules

This project ignores:

* `target/`
* `.idea/`
* `*.iml`
* `.env`

Ensuring a clean and professional repository.

---

## 📌 Future Enhancements

* 🔑 Role-based authentication (Admin/User)
* 📊 Dashboard & analytics
* 🌍 Deployment on cloud (AWS / Render)
* 🤝 Improved AI interaction

---

## 👨‍💻 Developer

**Madan Gopal Gupta**
Java Full Stack Developer (Spring Boot | MERN)

* 📧 Email: [Madang059@gmail.com](mailto:Madang059@gmail.com)
* 🔗 LinkedIn: [https://www.linkedin.com/in/madan059 ](https://www.linkedin.com/in/madan059)
* 💻 GitHub: [https://github.com/Madan059](https://github.com/Madan059)

---

⭐ If you like this project, don’t forget to star the repository!
