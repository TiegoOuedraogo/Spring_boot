#FROM ubuntu:latest
#LABEL authors="tiegoouedraogo"
#
## Use an official Java runtime as a parent image
#FROM openjdk:17-jdk-slim
#
## Set the working directory in the container
#WORKDIR /app
#
## Copy the jar file from the target folder to the container
#COPY target/your-app.jar app.jar
#
## Make port 8080 available to the world outside this container
#EXPOSE 8080
#
## Run the jar file
#ENTRYPOINT ["java", "-jar", "app.jar"]
