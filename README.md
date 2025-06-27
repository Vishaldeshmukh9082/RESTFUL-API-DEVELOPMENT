# RESTFUL-API-DEVELOPMENT

*COMPANY NAME*: CODDETECH IT SOLUTIONS

*NAME*: Vishal Sanjay Deshmukh

*INTERN ID*: CT6MTDK659

*DOMAIN*: SOFTWARE DEVELOPMENT

*DURATION*: 6 MONTHS

*MENTOR*: NEELA SANTOSH


This project is a fully functional RESTful API developed using Spring Boot, designed to manage a simple library system. It implements complete CRUD (Create, Read, Update, Delete) functionality for managing a collection of books. The goal of this project is to demonstrate the use of modern Java-based backend technologies to build scalable and maintainable APIs suitable for real-world applications.

The application is built using the Spring Boot framework, which simplifies the setup and development of Spring applications by providing default configurations and reducing boilerplate code. For data persistence, the project uses Spring Data JPA, which abstracts the complexities of database access and allows us to interact with the database using simple repository interfaces. The application is configured with an H2 in-memory database, which is lightweight and ideal for development and testing environments. However, it can be easily switched to a production-ready database such as MySQL or PostgreSQL with minimal configuration changes.

The central entity in this system is Book, which contains fields such as id, title, author, isbn, and quantity. This entity is mapped to a database table using JPA annotations, allowing for automatic generation and management of database schemas.

The BookRepository interface extends JpaRepository, providing built-in methods to perform common database operations like findAll(), findById(), save(), and deleteById() without writing any SQL queries. This simplifies data access and improves development speed and efficiency.

The BookController class is a REST controller that handles HTTP requests and maps them to corresponding CRUD operations. It uses annotations like @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping to define endpoints for accessing and modifying book records. For instance, a GET request to /books retrieves all books, while a POST request to /books adds a new book to the database. This separation of concerns ensures that each component in the application has a well-defined responsibility.

The application configuration is handled through the application.properties file, where the H2 console is enabled, and the JDBC connection details are specified. This allows developers to visually inspect the in-memory database via a browser interface, which can be helpful for debugging and verification.

To run the project, the LibraryApiApplication class serves as the main entry point. Annotated with @SpringBootApplication, it initializes the Spring context and starts the embedded server (typically on port 8080 by default). The API is immediately available for testing using tools like Postman or curl, and endpoints can be documented using tools like Swagger/OpenAPI if needed.


# OUTPUT
![Image](https://github.com/user-attachments/assets/c9fd48bd-bd81-4d37-af2e-64eac24b4fe5)
![Image](https://github.com/user-attachments/assets/ac048ff5-c423-4b4d-b0cd-dc6d38faf53e)
![Image](https://github.com/user-attachments/assets/5ae28d88-ec01-4757-84d3-f41a0d3f1d23)
![Image](https://github.com/user-attachments/assets/97ec69a4-073d-4659-b7c2-16ce0942f594)
![Image](https://github.com/user-attachments/assets/74455817-7304-410d-b7d3-8d95844a835f)
