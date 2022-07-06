FROM openjdk:11
ADD target/Cricket-Data-0.0.1-SNAPSHOT.jar Cricket-Data-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","Cricket-Data-0.0.1-SNAPSHOT.jar"d]