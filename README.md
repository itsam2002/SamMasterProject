# SamMasterProject

# REST API Concept

In Spring, @RestController, @RequestParam, and @PathVariable are annotations used for building web services.

**@RestController**: 

This class-level annotation is used to define a controller that handles RESTful API requests. It is a combination of @Controller and @ResponseBody, meaning that the data returned by the handler methods is automatically serialized into the HTTP response body (usually JSON or XML) rather than rendering a view.

**@RequestParam**: 

This method parameter-level annotation is used to extract query parameters or form data from the URL. It is commonly used for filtering data or when the parameters are optional.

**@PathVariable**: 

This method parameter-level annotation is used to extract values directly from the URI path itself (URI templates). It is typically used to identify a specific resource, such as a user ID or a product ID, in a RESTful URL structure.

## Summary of Differences

### Annotation 	Purpose	Example URL Usage

@RestController	
Marks a class to serve REST endpoints and return data directly.	
N/A (Class-level)

@RequestParam	Extracts values from the query string.	
http://example.com/api/users?id=123

@PathVariable	Extracts values from the URI path template.	
http://example.com/api/users/123
