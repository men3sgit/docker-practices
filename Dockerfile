FROM openjdk:17-jdk-alpine

ADD build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 9090