FROM maven:latest

WORKDIR /app

COPY pom.xml .
COPY src /app/src

RUN mvn clean package -DskipTests

COPY /target/*.jar springboot-microservices-gateway.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","springboot-microservices-gateway.jar"]
