FROM openjdk:13-jdk-slim
VOLUME /tmp

EXPOSE 8081

WORKDIR "/app"
COPY "pom.xml" "/app"
COPY "mvnw" "/app"
COPY ".mvn/" "/app/.mvn"

ENTRYPOINT ["./mvnw","spring-boot:run"]