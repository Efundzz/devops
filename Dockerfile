FROM openjdk:11
RUN apt-get update && apt-get install -y awscli
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
