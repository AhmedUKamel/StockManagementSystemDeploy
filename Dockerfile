FROM eclipse-temurin:20-jdk-alpine
VOLUME /tmp
COPY target/*.jar stockmanagementsystem.jar
ENTRYPOINT ["java","-jar","/stockmanagementsystem.jar"]
EXPOSE 8080