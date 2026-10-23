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
WORKDIR /app

COPY --from=builder /app/target/*.jar springboot-microservices-product.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "springboot-microservices-product.jar"]
