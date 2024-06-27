FROM openjdk:23-ea-17-slim

RUN mkdir /app

COPY target/qa-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

EXPOSE 8050

ENTRYPOINT ["java", "-jar", "app.jar"]
