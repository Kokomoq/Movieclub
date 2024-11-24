Movieclub

The Movieclub application simplifies movie management and enhances user interaction by offering features like film cataloging, user registration, and secure access through modern web technologies. Built using Spring Boot, this project employs efficient caching and secure mechanisms for a seamless experience. It integrates with external APIs to fetch movie data, supporting manual additions while ensuring data uniqueness. Key features include:

Movie Catalog Management
Secure JWT-Based Access
User Registration and Login
Caching for Improved Performance
Regular Updates of Movie Information
Detailed Movie Entries: Title, genre, release date, and ratings

AUTHOR: DAWID DREZEK

LINKEDIN: https://www.linkedin.com/in/dawid-drezek

Specification
Spring Boot application with a modular monolithic architecture
Use of NoSQL (MongoDB) for database management
JWT token-based authentication for secure access
Caching with Redis to enhance response time
Dependency injection and loose coupling facilitated by Spring framework
High-quality testing coverage using JUnit and Mockito
API-driven data updates scheduled periodically

## Tech

Movieclub is developed using following technologies: <br>

Core: <br>
![image](https://img.shields.io/badge/17-Java-orange?style=for-the-badge) &nbsp;
![image](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) &nbsp;
![image](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring) &nbsp;
![image](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white) &nbsp;
![image](https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white) &nbsp;

## Rest-API Endpoints

The Movieclub application provides a variety of REST API endpoints:

Service url: http://localhost:8080

| HTTP METHOD | Endpoint           |          REQUEST            |   RESPONSE   |                 Function                    |
|-------------|--------------------|-----------------------------|--------------|---------------------------------------------|
| GET         |  /movies           |              -              |     JSON     | Retrieve all movie entries                  |
| GET         |  /movies/{movieId} |   PATH VARIABLE (movieId)   |     JSON     | Get details of a specific movie             |
| POST        |  /movies           |      BODY-JSON (movie)      |     JSON     | Add new movie                               |
| POST        |  /register         | BODY-JSON (userDetails)     |     JSON     | Register a new user                         |
| POST        |  /token            |  BODY-JSON (loginDetails)   |     JSON     | Generate a JWT access token                 |

<br>
