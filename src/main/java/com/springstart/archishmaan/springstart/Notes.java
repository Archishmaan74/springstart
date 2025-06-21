package com.springstart.archishmaan.springstart;

public class Notes {
    //1. Spring Boot Basics
    //Spring Boot helps build Java applications faster by removing the need for complex configurations. It auto-sets things up so developers can focus more on writing business logic instead of boilerplate code.
    //✅ It uses embedded servers like Tomcat, so no need to install them separately.
    //✅ You can create standalone apps with just a main method and Spring Boot dependencies.

    //2. @SpringBootApplication
    //This is a special annotation used on the main class. It tells Spring Boot to treat the class as a configuration file, scan for components, and auto-configure the application during startup.
    //✅ It is a combination of three annotations: @Configuration, @EnableAutoConfiguration, and @ComponentScan.
    //✅ Without this, Spring wouldn’t know where to start scanning and configuring.

    //3. Main Class with CommandLineRunner
    //If your main class implements CommandLineRunner, the run() method inside it will automatically execute after the application starts. It's useful for testing or initializing data at startup.
    //✅ The method receives any command-line arguments passed when running the app.
    //✅ Ideal for quick database inserts or startup prints without building a REST API.

    //4. Beans
    //A bean is simply an object that Spring manages and creates for you. You define beans using the @Bean annotation, and Spring takes care of creating and injecting them wherever needed.
    //✅ Beans help in reducing tight coupling and improving testability.
    //✅ Beans are typically defined in a class marked with @Configuration.

    //5. Interfaces and Implementations
    //An interface defines a set of methods that can have different implementations. For example, DB is an interface, and DevDB or ProdDB are its implementations. This makes the code flexible and easy to switch between environments.
    //✅ Using interfaces makes your code more modular and easy to test.
    //✅ You can swap logic without changing dependent classes, just by changing the implementation.

    //6. Dependency Injection (@Autowired)
    //Instead of creating objects manually, Spring can inject them into your class using @Autowired. It helps in writing cleaner code and reduces tight coupling between classes.
    //✅ It follows the "Inversion of Control" (IoC) principle.
    //✅ Spring figures out which object to inject by checking types and qualifiers.

    //7. @Configuration and @Bean
    //A class marked with @Configuration is used to define beans using methods annotated with @Bean. This helps Spring know how to create and manage specific objects in the application.
    //✅ All methods in the class return objects that Spring will treat as beans.
    //✅ It separates configuration logic from the main business logic.

    //8. @ConditionalOnProperty
    //This annotation is used to load a specific bean only if a certain property is set in application.properties. It helps in switching between development and production setups easily without changing code.
    //✅ Useful when you want different behavior based on environment or mode.
    //✅ Helps avoid hardcoded logic checks like if (env == dev) in code.

    //9. application.properties File
    //This file is used to define settings for your Spring Boot app like project.mode=development. Spring reads these properties at startup to control how the application behaves.
    //✅ You can define server ports, logging levels, database URLs, and more here.
    //✅ It allows dynamic configuration without touching Java code.
}
