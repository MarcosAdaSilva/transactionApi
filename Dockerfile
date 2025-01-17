FROM openjdk:17-jdk-slim
WORKDIR /app
COPY wait-for-it.sh /wait-for-it.sh
COPY target/transaction-api.jar app.jar
ENTRYPOINT ["/wait-for-it.sh", "postgres:5432", "--", "java", "-jar", "app.jar"]
