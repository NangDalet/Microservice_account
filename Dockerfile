#Start with base image containing java runtime
FROM openjdk:22 as build

#Infomation of owner of mainainer of image (optional)
MAINTAINER daletbank  optional

#Add the applicatoin's jar to the container
COPY target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java","-jar","/account-0.0.1-SNAPSHOT.jar"]