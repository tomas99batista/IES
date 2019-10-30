# Respostas

## 3.1 What happens to your data when the application is stopped and restarted? How could you change that behavior

    The data restarted, didn't saved the changes, it's not storing.
    This happens because when we run the application again, the following lines are executed:
     log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
  log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
    Also, we are not storing the database in any file on our computer, so it's volatile.
    "All examples use an embedded database with in memory persistence, which means, the data is only stored as long as the process is running. Just switch to a regular database like MySQL or use H2 with a file based storage url, which is also permanently saved on your disk."
        src: <https://stackoverflow.com/questions/30091673/spring-jpa-repository-keep-data-on-server-restart/30092932>
    Solution: "For the latter, just add the following property to your application.properties:
            spring.datasource.url=jdbc:h2:tcp://localhost/${path/to/your/db/file}
    and replace ${path/to/your/db/file} with the path where you want to store the database (note, the folder you configure here will be created, if it doesn't exist)."

## 3.1 - Describe the role of the elements modeled in the previous point

    > @RestController is a specialized version of the controller. It includes the @Controller and @ResponseBody annotations and as a result, simplifies the controller implementation.

    > @Repository’s job is to catch persistence specific exceptions and rethrow them as one of Spring’s unified unchecked exception. For this Spring provides PersistenceExceptionTranslationPostProcessor, that requires to add in our application context.

    > @Entity annotation defines that a class can be mapped to a table. And that is it, it is just a marker.

## 3.1 - Why is that the Employee entity does not have getters and setters defined? (tip: Lombok)

    @Data is a Lombok annotation to create all the getters, setters, equals, hash, and toString methods, based on the fields.

## 3.2 - Explain the annotations @Table, @Column, @Id found in the Employee entity

@Table: The @Table annotation allows you to specify the details of the table that will be used to persist the entity in the database.

@Column: Is used to specify the mapped column for a persistent property or field. If no Column annotation is specified, the default values apply.

@Id: @Id marks a field in a model class as the primary key.

## 3.2 - Explain the use of the annotation @AutoWire

The annotation can be used directly on properties, therefore eliminating the need for getters and setters.
