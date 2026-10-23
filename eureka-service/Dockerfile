# ==========================================
# ESTAGIO 1: Compilacao e Build da aplicacao
# ==========================================

FROM maven:latest AS builder

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src
RUN mvn clean package -DskipTests

# ==========================================
# ESTAGIO 2: Imagem final leve para rodar o JAR
# ==========================================

FROM eclipse-temurin:latest

RUN apt-get update \
    && apt-get install -y --no-install-recommends curl \
    && rm -rf /var/lib/apt/lists/* 

WORKDIR /app

COPY --from=builder /app/target/*.jar springboot-microservices-eureka.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","springboot-microservices-eureka.jar"]
