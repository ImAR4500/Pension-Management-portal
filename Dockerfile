FROM openjdk:8
ADD target/pmanagementportalapp.jar pmanagementportalapp.jar
ENTRYPOINT ["java", "-jar","pmanagementportalapp.jar"]
EXPOSE 9085