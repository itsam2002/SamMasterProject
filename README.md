# SamMasterProject

@PostConstruct and @PreDestroy are lifecycle annotations used in Spring to manage methods that need to run immediately after a bean is initialized and just before it is destroyed, respectively.

**@PostConstruct**

Purpose: Marks a method that should be executed after a bean has been constructed and all its dependencies have been injected by the Spring container.
Timing: It is called only once in the entire bean lifecycle, after the constructor runs but before the bean is put into service.
Usage: Ideal for performing initialization tasks that require injected dependencies, such as:
Setting initial property values or threshold limits.
Validating bean properties.
Preparing resources or starting background processes.

**@PreDestroy**

Purpose: Marks a method that should be executed just before the bean is removed from the Spring container, typically when the application context is closed during shutdown.
Timing: It acts as a callback notification to signal that the instance is in the process of being removed.
Usage: Used for cleanup logic to release resources the bean is holding, such as:
Closing database connections.
Closing files or sockets.
Clearing caches.

#### **Key Considerations**

**Dependency:** These annotations are part of the Jakarta EE Common Annotations API (jakarta.annotation package in modern Spring/Java versions). You may need to add the jakarta.annotation-api dependency to your project if you are using Java 9 or above and they are not included by default.

**Bean Scope:** Both annotations work reliably with singleton-scoped beans. For prototype-scoped beans, the Spring container doesn't fully manage their lifecycle after creation, so the @PreDestroy method might not be called automatically.

**Alternatives:** While still widely used, modern Spring offers alternatives like ApplicationReadyEvent listeners for post-startup logic or implementing the DisposableBean interface for destruction callbacks, which can offer more flexibility in specific scenarios. 
