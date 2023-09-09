FROM adoptopenjdk:11-jre-hotspot-bionic

WORKDIR /app

COPY target/myapp.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]