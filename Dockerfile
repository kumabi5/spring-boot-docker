FROM openjdk:17
MAINTAINER "Biresh Singh"
copy target/spring-boot-docker-service.jar /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-boot-docker-service.jar"]
