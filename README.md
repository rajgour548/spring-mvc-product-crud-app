🚀  Product-CRUD Application

A simple Spring MVC web application using Spring Framework, MySQL, and JSP for the frontend.
The project is built with Maven and deployed on Apache Tomcat.

🚀 Features
```bash
✔️ Follows MVC architecture using Spring Framework

✔️ JSP used for frontend views

✔️ MySQL database integration

✔️ Supports CRUD operations

✔️ Clean, modular, and easy to extend
```
🛠️ Tech Stack
```bash
- Backend	→ Java, Spring MVC, Spring Core
- Frontend → JSP, HTML, CSS
- Database → MySQL
- Build Tool → Maven
- Server → Apache Tomcat (or any servlet container)
```
📁 Project Structure
```bash
src/
 ├─ main/
 │   ├─ java/                 # Java source files (controllers, models, services)
 │   ├─ resources/            # Application resources
 │   └─ webapp/
 │       ├─ WEB-INF/
 │       │   └─ jsp/          # JSP views
 │       └─ web.xml           # Web configuration
 └─ test/                     # Test classes
```
⚙️ Setup Instructions
```bash
1️⃣ Clone the Repository
git clone <repo-url>

2️⃣ Import Project into IDE

Use Eclipse, IntelliJ IDEA, or any Java IDE

Import as a Maven project

3️⃣ Configure MySQL

Create a database in MySQL

Update database credentials in:

application.properties
# or
spring-config.xml

4️⃣ Build Using Maven
mvn clean install

5️⃣ Deploy on Apache Tomcat

Copy the generated .war file to Tomcat/webapps

Start Tomcat server

6️⃣ Access the Application
http://localhost:8080/<your-app-name>/
```
📝 Notes
```bash

Make sure MySQL server is running before starting the application

Update DB credentials (username, password, URL) in config file

All JSP files are located inside:

WEB-INF/jsp/
```
