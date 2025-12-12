# SamMasterProject
Combined all the logic

# Lession1 - FAT JAR and Java Parent

### **JAR vs. FAT JAR**

**JAR**

JAR doesn't have everything about your project

**FAT JAR** contains everything classes, pom, application.properties

java -jar <project-name-snapshot.jar>

**FAT JAR**

To create FAT JAR you have to add SpringBoot Maven Plugin in POM

<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-maven-plugin -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <version>4.0.0</version>
</dependency>


### **SPRING-BOOT-STARTER-PARENT**

When you put PARENT in POM then you don't have to give version to other dependencies. It will inherit from parent.

<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>4.0.0</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>

