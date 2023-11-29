FROM openjdk:17
ADD target/StudentDemo-0.0.1-SNAPSHOT.jar StudentDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar","StudentDemo-0.0.1-SNAPSHOT.jar"]