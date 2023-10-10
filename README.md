# 🚀 Pi Calculator: A Beginner's Exploration

## 🌟 Project Overview

Welcome to **Pi Calculator**! This is a beginner-friendly project designed to pave your pathway into the realms of software development, exploring the nuances of **Java**, **Maven**, and **Docker**. The project, while simple, calculates the mathematical constant Pi to a specified number of digits, providing a gentle introduction to various technologies and functionalities.

## 🛠 Key Technologies

- **[Java](https://www.oracle.com/java/technologies/javase-downloads.html)**: A robust and widely-used programming language.
- **[Maven](https://maven.apache.org/download.cgi)**: A comprehensive build automation and dependency management tool for Java projects.
- **[Docker](https://www.docker.com/products/docker-desktop)**: A platform that enables developers to develop, ship, and run applications inside containers.

## 📁 Project Structure

- `src/main/java/HelloWorld.java`: The entry point to our application, utilizing PiCalculator to compute and display Pi.
- `src/main/java/PiCalculator.java`: A utility class responsible for calculating Pi to a specified number of digits.
- `pom.xml`: The Maven POM (Project Object Model) file, containing configuration information and dependencies for Maven to build the project.
- `Dockerfile`: Contains instructions for Docker to build an image of the application, enabling it to be run in any Docker environment.

## 🚀 How to Use

### Prerequisites

Ensure you have the following installed:
- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Docker](https://www.docker.com/products/docker-desktop)

### 🏗 Build and Run with Maven

Navigate to the project directory and execute the following commands to compile and run the application:

```sh
mvn compile
mvn exec:java -Dexec.mainClass="HelloWorld" -Dexec.args="5"
```
_📝 Note: Replace `5` with the number of digits of Pi you wish to calculate._

### 🐳 Build and Run with Docker

Build the Docker image:

```sh
docker build -t pi-calc-img .
```

Run the Docker container, replacing `[num_digits]` with your desired number of digits:

```sh
docker run pi-calc-img java -jar /jb-hello-world-maven.jar [num_digits]
```

## 🎓 Learning Outcomes

- **Java Programming**: Grasp the basics of Java programming, focusing on utilizing classes and methods.
- **Maven Management**: Learn to manage dependencies and build Java projects using Maven.
- **Docker Containerization**: Gain insights into containerizing an application using Docker, ensuring it is platform-independent.

## 🤝 Contributing

Feel free to fork this project and enhance it. Here are ways you can contribute:
- Enhancing the Pi calculation algorithm.
- Implementing input validation and error handling.
- Adding unit tests to ensure the accuracy of calculations.

## 📜 License

This project is open-source and available to everyone under the [MIT License](LICENSE).

