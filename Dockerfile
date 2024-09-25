FROM openjdk:17
COPY ./target/Calculator_SPE-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","Calculator_SPE-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Calculator"]