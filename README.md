# SamMasterProject

**POM Dependency for Hibernate**

<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa -->
    <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <version>4.0.1</version>
    </dependency>

    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <!-- Spring Boot manages the version automatically in most cases -->
    </dependency>

Application.properties settings for Hibernate

# Database Connection Settings
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate and JPA Properties
 
#'update' automatically updates the schema based on your entities

spring.jpa.hibernate.ddl-auto=update

#Shows the generated SQL in the console (useful for debugging)

spring.jpa.show-sql=true

#Formats the SQL output for readability

spring.jpa.properties.hibernate.format_sql=true

#Specifies the dialect for optimal SQL generation

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect