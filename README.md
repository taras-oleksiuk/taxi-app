# Table of contents <h>
* [Description](#description)
* [Technologies](#technologies)
* [Functionality](#functionality)
* [Setup](#setup)
## Description <h>
This project shows my skills in Java, OOP, SOLID, N-tier architecture, JDBC and Web principles.
Taxi service with authentication system.
## Technologies <h>
* Java 11
* MySQL
* Maven
* Javax servlet API
* Jstl
* Tomcat 9.0.54
* HTML, CSS
* Log4j2
## Functionality <h>
* Add driver to car 'cars/drivers/add'
* Add car `/cars/add`
* All cars `/cars/all`
* Add drive  `/drivers/add`
* All drivers `/drivers/all`
* Add manufacture `/manufacturers/add`
* All manufacturers `/manufacturers/all`
## Setup <h>
1. Install MySQL.
2. Install Tomcat 9.0.54
3. Fork this project and clone it.
4. Initialize your database using init_db.sql file.
5. Add your info to the ConnectionUtil located in util to be able to connect to your database.
Fill in the configuration data:    
-   `private static final String URL = "YOUR URL"`;
-   `private static final String USERNAME = "YOUR USERNAME"`;
-   `private static final String PASSWORD = "YOUR PASSWORD"`;
-   `private static final String JDBC_DRIVER = "YOUR DRIVER";`
6. Run this project using a local Tomcat server.

