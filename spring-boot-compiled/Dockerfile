FROM openjdk:12-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY spring-boot-demo-1.0-SNAPSHOT.jar app.jar
COPY lib lib
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]