# Use OpenJDK 17 as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app1

# Copy the JAR file from the target folder to the container
COPY target/*.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]
