FROM maven:latest

WORKDIR /app

COPY pom.xml .
COPY src /app/src

RUN mvn clean package -DskipTests

COPY /target/*.jar springboot-microservices-product.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","springboot-microservices-product.jar"]
