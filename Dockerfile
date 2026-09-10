FROM eclipse-temurin:25
LABEL authors="DELL"
COPY ./target/classes/com /tmp/com
WORKDIR /tmp
ENTRYPOINT ["java", "com.napier.sem.App"]
