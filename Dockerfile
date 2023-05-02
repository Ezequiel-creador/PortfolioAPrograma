FROM amazoncorretto:8-alpine-jdk
MAINTAINER ezequiel-creador
COPY target/app-0.0.1-SNAPSHOT.jar app-back.jar
ENTRYPOINT ["java","-jar","/app-back.jar"]