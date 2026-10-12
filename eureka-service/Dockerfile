FROM maven:latest

RUN apt-get update \
    && apt-get install -y --no-install-recommends curl \
    && rm -rf /var/lib/apt/lists/* 

WORKDIR /app

COPY pom.xml .
COPY src /app/src

RUN mvn clean package -DskipTests

COPY /target/*.jar springboot-microservices-eureka.jar

EXPOSE 8761

ENTRYPOINT ["java","-jar","springboot-microservices-eureka.jar"]
