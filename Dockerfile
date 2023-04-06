FROM openjdk

WORKDIR /app

COPY target/consulta-consulta.jar /app/consulta.jar

ENTRYPOINT ["java","-jar","consulta.jar"]