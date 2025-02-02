# Simple Spring Boot API

This is a simple Spring Boot API that provides a basic endpoint returning basic information such as email, the current time and the URL for this page. This guide will help you set up and run the application locally.

## Prerequisites

Ensure you have the following installed on your system:

- **Java 23+** (JDK 23 or later)
- **Maven 3+** (for dependency management)
- **Git** (to clone the repository)
- **Postman or cURL** (to test the API, optional)

## Getting Started

### 1. Clone the Repository
```sh
git clone https://github.com/meysdays/HNG12.git
cd HNG12
```

### 2. Build the Application
```sh
mvn clean install
```

### 3. Run the Application
```sh
mvn spring-boot:run
```

### 4. Access the API
Once the application is running, you can access the API endpoint:

- **Get Info Endpoint:**
  ```
  GET http://localhost:8080/api/info
  ```

You can test this in your browser, Postman, or using cURL:
```sh
curl http://localhost:8080/api/info
```
Expected Response
```
{
    "email": "igbokwevictor122@gmail.com",
    "current_datetime": "2025-02-02T16:30:04.035697800Z",
    "github_url": "https://github.com/meysdays/HNG12/tree/master/restapi"
}
````

## Configuration

- The application runs on **port 8080** by default. To change it, modify `application.properties`:
  ```properties
  server.port=9090
  ```

## Dependencies Used
- **Spring Boot Starter Web** (for building RESTful APIs)
- **Spring Boot DevTools** (for development convenience)
- **Maven** (for dependency management)

## Deployment
To package the application as a JAR and run it manually:
```sh
mvn package
java -jar target/simple-api-0.0.1-SNAPSHOT.jar
```

## Troubleshooting

### 1. Port Already in Use
If you get a **port conflict error**, run:
```sh
lsof -i :8080  # Find process using the port
kill -9 <PID>  # Kill the process
```

Or change the port in `application.properties`.

### 2. Maven Build Issues
If the build fails, try:
```sh
mvn clean install -U
```

## License
This project is licensed under the MIT License.

## Author
- **Your Name** - Victor Igbokwe
- https://hng.tech/hire/java-developers

