FROM sgrio/java-oracle

RUN apt-get update
RUN apt-get install -y maven

COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src

WORKDIR /usr/local/service
RUN mvn package
CMD [ "java" , "-cp", "targe/docker-service-1.0-SNAPSHOT.jar", "com.example.thymeleaf.ThymeleafApplication"]