FROM openjdk:8
ADD target/pensionmanagementportalservice.jar pensionmanagementportalservice.jar
ENTRYPOINT ["java", "-jar","pensionmanagementportalservice.jar"]
EXPOSE 9085
