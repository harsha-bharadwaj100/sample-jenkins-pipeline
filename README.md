# sample-jenkins-pipeline

This repository demonstrates a sample Jenkins CI/CD pipeline setup for testing and learning purposes.

## Purpose
This project is designed to help you understand and test Jenkins pipelines with a simple Java application built using Gradle.

## Structure
- **Jenkinsfile**: Defines the CI/CD pipeline with stages for Checkout, Build, Test, and Deploy
- **src/main/App.java**: A simple Java application that prints "Hello, Jenkins Pipeline!"
- **src/test/AppTest.java**: Unit tests for the Java application using JUnit
- **build.gradle**: Gradle build configuration for building and testing the Java application

## Pipeline Stages
1. **Checkout**: Checks out the code from the repository
2. **Build**: Compiles the Java application using Gradle
3. **Test**: Runs unit tests using JUnit
4. **Deploy**: Simulates a deployment step
