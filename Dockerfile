# Build image using
# docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/spring-rest-service .
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]