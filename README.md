# SamMasterProject

# Spring Boot DEVTools

Spring Boot DevTools is a set of utilities that enhance the development experience by providing features like automatic application restarts, live browser reloading, and improved debugging support. These tools aim to reduce development time by eliminating the need for manual server restarts after every code change.

## Key Features

**• Automatic Restarts:** DevTools monitors for file changes in the classpath and automatically restarts the application. This is much faster than a manual "cold start" because it uses two classloaders, keeping the base classloader with unchanging third-party jars running.

**• LiveReload:** The module includes an embedded LiveReload server. When used with a LiveReload browser extension, any resource change can trigger an automatic browser refresh.

**• Property Defaults:** DevTools automatically applies sensible development-time configuration properties, such as disabling template caching (e.g., Thymeleaf, Freemarker) to allow immediate visibility of changes.

**• Remote Debugging Support:** It provides support for remote debugging and remote updates over HTTP, useful for applications deployed in environments like Docker or Cloud Foundry where direct remote debugging might be complex to set up.

**• Auto-Disabling in Production:** The tools are automatically disabled when running a fully packaged application (e.g., via java -jar), ensuring they do not interfere with production performance.

## How to Use Spring Boot DevTools

To enable these features, add the spring-boot-devtools dependency to your project's build file:

### Maven (pom.xml):

````
<dependencies>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-devtools</artifactId>
<scope>runtime</scope>
<optional>true</optional>
</dependency>
</dependencies>
````

### Gradle (build.gradle):
````
dependencies {
developmentOnly("org.springframework.boot:spring-boot-devtools")
}
