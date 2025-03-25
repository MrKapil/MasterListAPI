
# Master List API
This API manages Master List data, allowing users to store, retrieve, and filter entries. It provides CRUD operations using Spring Boot and MySQL for efficient data handling.

## Features
✔ CRUD operations for Master List entries.
✔ MySQL integration for data persistence.
✔ Filtering and pagination for optimized queries.
✔ API tested using Postman & Browser.
✔ Spring Boot framework with RESTful architecture.

## Prerequisites
Before running the application, ensure you have:

-Java Development Kit (JDK): Version 17 or higher

-Maven: For building the project

-MySQL: For database integration

-Spring Boot

-Server: Apache Tomcat

-Postman (optional): For API testing

## Database Configuration
This project uses MySQL as the database. Update your database credentials in application.properties:

####properties

spring.datasource.url=jdbc:mysql://localhost:3306/master_list_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


###To connect to a remote MySQL database, use the following (example):
spring.datasource.url=jdbc:mysql://your-remote-host:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
