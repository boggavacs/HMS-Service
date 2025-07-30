# HMS-Service Application Instructions

This file provides setup and usage instructions for the HMS-Service Spring Boot application.

## Prerequisites
- Java 17 or later
- Maven
- PostgreSQL database

## Configuration
1. **Database Setup**
   - Ensure you have a running PostgreSQL instance.
   - Create a database for the application.
   - Update the following properties in `src/main/resources/application.properties`:
     - `spring.datasource.url=jdbc:postgresql://<host>:<port>/<database>`
     - `spring.datasource.username=<your_db_username>`
     - `spring.datasource.password=<your_db_password>`

2. **Connection Pooling**
   - HikariCP is used for connection pooling. You can adjust pool size and timeouts in `application.properties` as needed for your environment.

## Build and Run
1. **Build the project:**
   ```sh
   ./mvnw clean install
   ```
2. **Run the application:**
   ```sh
   ./mvnw spring-boot:run
   ```
   The application will start on the default port (usually 8080).

## Troubleshooting
- Ensure all required properties in `application.properties` are set.
- Check database connectivity and credentials.
- Review logs for error details if the application fails to start.

## Additional Notes
- For production, review and secure all configuration values.
- Adjust HikariCP settings for optimal performance based on your workload.

---
For further help, see the `HELP.md` file or contact the project maintainer.
