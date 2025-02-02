FROM maven:3.8.5-openjdk-23 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:23.0.1-jdk-slim
COPY --from=build /target/meysdays-0.0.1-SNAPSHOT.jar meysdays.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","meysdays.jar"]