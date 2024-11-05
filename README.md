# Concesionario Vehicular - Spring Boot 3 API

Este es un ejemplo de una API REST desarrollada utilizando **Java 17** con **Spring Boot 3.2.11**, **H2** como base de datos en memoria,
y herramientas como **Swagger** para la documentación, **Lombok** para la simplificación del código, y **Spring Data JPA** para la interacción con la base de datos.

## Tecnologías utilizadas

- **Intellij IDEA**
- **Java 17**
- **Spring Boot 3.2.11**
- **H2 Database** (base de datos en memoria)
- **Maven** como gestor de dependencias
- **Spring Web** (para la creación de endpoints REST)
- **Spring Data JPA** (para acceso a datos)
- **Swagger** (para documentación de la API)
- **Lombok** (para simplificar el código y reducir la cantidad de boilerplate)

## Requisitos

Antes de ejecutar este proyecto, asegúrate de tener instalados los siguientes programas:

- **JDK 17** o superior: [Descargar desde Oracle](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) o [OpenJDK](https://openjdk.java.net/)
- **Maven**: [Descargar e instalar Maven](https://maven.apache.org/download.cgi)
- **IDE**: Se recomienda usar **IntelliJ IDEA** o cualquier otro IDE compatible con Java.

## Instalación

1. **Clonar el repositorio:**
2. **Compilar el proyecto: Si tienes Maven instalado, puedes compilar el proyecto ejecutando el siguiente comando (mvn clean install)**
3. **Ejecutar la aplicación:**
4. **Acceder a la API:Una vez que la aplicación esté corriendo, puedes acceder a los endpoints de la API en la siguiente URL: http://localhost:8080/doc/swagger-ui/index.html**

## Base de datos H2
   La base de datos H2 estará en memoria, por lo que los datos se perderán cuando se cierre la aplicación.
   Para acceder a la consola web de H2 y explorar la base de datos, puedes visitar: **http://localhost:8080/h2-console**
   User Name: sa
   Password: 
   ![image](https://github.com/user-attachments/assets/eddf779a-d3c8-41ca-800c-84bcedf0db5a)
   Nota: Asegúrate de que el JDBC URL sea **jdbc:h2:mem:concesionario** para conectarte correctamente a la base de datos en memoria.
   Ejecutar el archivo:  concesionarioBD.sql para cargar los datos.

## Dependencias (pom.xml)
Este proyecto utiliza Maven para la gestión de dependencias. El archivo pom.xml incluye todas las dependencias para que el proyecto se ejecute correctmente.


¡Gracias por utilizar **Concesionario Vehicular - Spring Boot 3 API !** Si tienes alguna duda o problema, no dudes en abrir un issue en GitHub.

Este archivo README cubre desde la instalación hasta la ejecución, detalles sobre las tecnologías utilizadas, la configuración de la base de datos H2, 
y cómo acceder a la documentación de Swagger. ¡Espero que te sea útil para tu proyecto!



  
