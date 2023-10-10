# Use the official maven/Java image to create a build artifact.
# https://hub.docker.com/_/maven
FROM maven:3.8.4-openjdk-17 as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build a release artifact.
RUN mvn package -DskipTests

# Use OpenJDK to run the JAR.
FROM openjdk:17-jdk-slim

# Copy the jar to the production image from the builder stage.
COPY --from=builder /app/target/jb-hello-world-maven-0.1.0.jar /jb-hello-world-maven.jar

# Run the web service on container startup.
CMD ["java", "-jar", "/jb-hello-world-maven.jar"]
