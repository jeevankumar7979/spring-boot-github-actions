FROM eclipse-temurin:21-jre

WORKDIR /app

COPY build/libs/spring-boot-github-actions.jar spring-boot-github-actions.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-boot-github-actions.jar"]
