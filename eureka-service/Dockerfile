FROM maven:latest

WORKDIR /app

COPY pom.xml .
COPY src /app/src

RUN mvn clean package -DskipTests

COPY /target/*.jar springboot-microservices-eureka.jar

EXPOSE 8761

ENTRYPOINT ["java","-jar","springboot-microservices-eureka.jar"]
