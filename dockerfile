FROM maven:3-eclipse-temurin-17-alpine AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package



FROM openjdk:18.0.2.1-oraclelinux8
COPY   --from=build home/app/target/java-17-maven-project-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar","app.jar"]
EXPOSE 8080