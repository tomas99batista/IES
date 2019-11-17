## What are the responsibilities/services of a “servlet container”?

> The basic idea of Servlet container is using Java to dynamically generate the web page on the server side. So servlet container is essentially a part of a web server that interacts with the servlets. Servlet container is the container for Servlets.

## Web applications in Java can be deployed to stand-alone applications servers or embedded servers. Elaborate on when to choose one over the other

> A standalone server is a server that runs alone and is not a part of a group. This is, it's not part of the code, it's apart from the program software.

> An embedded HTTP server is a component of a software system that implements the HTTP protocol. It's part of the code, it's in the program software.

> We choose standalone server when we do not want the server to be part of the system, when we want simplicity we can choose embedded over standalone because we only need one software, we do not need one software to the server and one to the software.

## Give specific examples of annotations in Spring Boot that implement the principle of convention-over-configuration

> Convention over configuration (also known as coding by convention) is a software design paradigm used by software frameworks that attempts to decrease the number of decisions that a developer using the framework is required to make without necessarily losing flexibility.

> Spring Boot is Spring's convention-over-configuration solution for creating stand-alone, production-grade Spring-based Applications that you can "just run". It is preconfigured with the Spring team's "opinionated view" of the best configuration and use of the Spring platform and third-party libraries so you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration. Features:

    - Create stand-alone Spring applications
    - Embed Tomcat or Jetty directly (no need to deploy WAR files)
    - Provide opinionated 'starter' Project Object Models (POMs) to simplify your Maven configuration
    - Automatically configure Spring whenever possible
    - Provide production-ready features such as metrics, health checks and externalized configuration
    - Absolutely no code generation and no requirement for XML configuration

Examples:
> @Service: This annotation is used on a class. The @Service marks a Java class that performs some service, such as execute business logic, perform calculations and call external APIs. 

> @Repository: This annotation is used on Java classes which directly access the database. The @Repository annotation works as marker for any class that fulfills the role of repository or Data Access Object.

> @Controller: The @Controller annotation is used to indicate the class is a Spring controller. This annotation can be used to identify controllers for Spring MVC or Spring WebFlux.

> @Bean: This annotation is used at the method level. @Bean annotation works with @Configuration to create Spring beans.


## Which annotations are transitively included in the @SpringBootApplication?

> We use this annotation to mark the main class of a Spring Boot application:

> @SpringBootApplication encapsulates @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes.
