package com.karlib.karthik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class KarthikApplication {
	/*main application class MyProjectApplication annotated with @SpringBootApplication, 
	 * and a controller method index() mapped to the root URL ("/") 
	 * using @RequestMapping.*/
	
	/*@RestController: This annotation is used to indicate that the class is a controller that handles web requests. It combines @Controller and @ResponseBody, meaning that return values from methods are automatically serialized into JSON or XML responses.

	@SpringBootApplication: This annotation is used to enable Spring Boot's auto-configuration, component scanning, and other features. It is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes.

	@RequestMapping(value="/"): This annotation maps HTTP requests to handler methods of MVC and REST controllers. In this case, it maps requests to the root URL ("/") to the index() method.

index(): This method returns the string "Hello World !" as the response body when a request is made to the root URL.*/
		

	public static void main(String[] args) {
		SpringApplication.run(KarthikApplication.class, args);
	}
	
	/*
 Here's a breakdown of some common annotations and options used in Spring Boot for various components:

Controller Annotations:

@RestController: Combines @Controller and @ResponseBody. Used for RESTful APIs.
@Controller: Marks the class as a controller.
@RequestMapping: Maps HTTP requests to handler methods.
RequestMapping Options:

value / path: URL mapping for the method.
method: HTTP method (e.g., GET, POST, PUT, DELETE).
params: Request parameter conditions.
headers: Request header conditions.
consumes: Media types that the method can consume.
produces: Media types that the method can produce.



Service Annotations:

@Service: Marks the class as a service component.
Repository Annotations:

@Repository: Marks the class as a repository component for database access.
@Transactional: Defines the transactional behavior of repository methods.
Dependency Injection:

@Autowired: Automatically injects beans by type.
@Qualifier: Helps resolve ambiguity when multiple beans of the same type are available.
@Primary: Specifies a primary bean when multiple beans of the same type are available.
Exception Handling:

@ControllerAdvice: Global exception handler for controllers.
@ExceptionHandler: Handles exceptions within a controller.
Configuration:

@Configuration: Marks the class as a configuration class.
@Bean: Defines a bean within a configuration class.
Property Configuration:

@Value: Injects properties from property files.
@ConfigurationProperties: Binds properties to Java objects.
Validation:

@Valid: Marks a parameter for validation.
@Validated: Group-based validation for method parameters.
Spring Boot Specific Annotations:

@SpringBootApplication: Main application class annotation that enables auto-configuration.
@EnableAutoConfiguration: Enables Spring Boot's auto-configuration feature explicitly.
@ComponentScan: Scans for Spring components (e.g., controllers, services, repositories) within specified packages.
@EnableJpaRepositories: Enables JPA repositories scanning and configuration.
 
	 * 
	 * 
	 * */

}
