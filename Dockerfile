# Stage 1: Build stage
FROM maven:3.8.3-openjdk-17 as build
WORKDIR /project-dir
COPY . .
RUN mvn -B -DskipTests clean package

# Stage 2: Runtime stage
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /project-dir/target/lab5_back_end-0.0.1-SNAPSHOT.jar .
EXPOSE 9090
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar lab5_back_end-0.0.1-SNAPSHOT.jar"]
