FROM openjdk:20-jdk-slim
ARG JAR_FILE=target/*.jar
COPY cloud-tester.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
