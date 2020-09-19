FROM openjdk:8-jdk-alpine
ADD target/svc-bookstore-user-0.0.1-SNAPSHOT.jar svc-bookstore-user.jar
ENTRYPOINT ["sh","-c","java -jar /svc-bookstore-user.jar"]