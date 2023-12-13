FROM amd64/eclipse-temurin:21.0.1_12-jre-alpine
ARG JAR_FILE=target/*.jar
COPY cloud-tester.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
