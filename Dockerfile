FROM openjdk:8-jre
VOLUME /tmp
ADD target/devops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

