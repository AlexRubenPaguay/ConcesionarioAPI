# Concesionario Vehicular - Spring Boot 3 API

# 📋 Descripción
  API RESTful para crear y buscar clientes con sus respectivos vehículos, desarrollada en Java con Spring Boot 3.

# 🚀 Características Principales
# ✅ Operaciones
    - Crear un cliente con sus respectivos vehiculo/s.
    - Buscar un cliente con sus vehículos asoaciados.

# ✅ Tecnologías Implementadas

- **Intellij IDEA**
- **Java 17**
- **Spring Boot 3.2.11** (con arquitectura en capas)
- **H2 Database** (base de datos en memoria)
- **Maven** como gestor de dependencias
- **Spring Web** (para la creación de endpoints REST)
- **Spring Data JPA** (para acceso a datos)
- **Swagger** (para documentación de la API)
- **Lombok** (para simplificar el código y reducir la cantidad de boilerplate)
- **Logging** con SLF4J

# 🏗️ Arquitectura del Proyecto

<img width="372" height="455" alt="imagen" src="https://github.com/user-attachments/assets/c082f0f8-23cd-4916-ab28-d9f4b5cb3d93" />

# 🔧 Requisitos del Sistema
    - Java 17 o superior
    - Maven 3.6+
    - Spring Boot 3.x
    - Base de datos en memoria H2
    - Postman o similar para pruebas

# 📚 Endpoints de la API
- Base URL: http://localhost:2026/v1/concesionario/cliente
- Método	  -->Endpoint	              -->Descripción	
- GET	     -->/find/{identificacion}  -->Obtiene el cliente y sus vehículos asociados.
- POST	  -->/save	                 -->Crea cliente y sus vehículos asociados.
## Desde Swagger

<img width="1657" height="863" alt="imagen" src="https://github.com/user-attachments/assets/13bda84e-0614-45ef-97ab-95a786fe808b" />

# 🔍 Ejemplos de Uso

## Base de datos H2
  - La base de datos H2 estará en memoria, por lo que los datos se perderán cuando se cierre la aplicación.
  - Para acceder a la consola web de H2 y explorar la base de datos, puedes visitar: **http://localhost:2026/h2-console**
  - User Name: sa
  - Password: 12345

   <img width="580" height="528" alt="imagen" src="https://github.com/user-attachments/assets/65d6fe6d-04ca-4df9-93f7-2931d17d8e94" />

   Nota: Asegúrate de que el JDBC URL sea **jdbc:h2:mem:concesionario** para conectarte correctamente a la base de datos en memoria.
   Ejecutar el archivo:  concesionarioBD.sql para cargar los datos.
   
   <img width="1151" height="527" alt="imagen" src="https://github.com/user-attachments/assets/3c17ccfe-216a-4a5b-b373-ae0ae6460477" />

## 1.- Crear un cliente y sus respectivos vehículos.

<img width="1375" height="792" alt="imagen" src="https://github.com/user-attachments/assets/235b4766-ebe8-443c-a17f-fffa1cba80f8" />

## 2. Obtener un cliente por cédula.

<img width="1386" height="838" alt="imagen" src="https://github.com/user-attachments/assets/5547ad6b-753d-4207-b864-5e921f0954db" />

¡Gracias por utilizar **Concesionario Vehicular - Spring Boot 3 API !** Si tienes alguna duda o problema, no dudes en abrir un issue en GitHub.

Este archivo README detalla sobre las tecnologías utilizadas, la configuración de la base de datos H2, 
y cómo acceder a la documentación de Swagger. ¡Espero que te sea útil para tu proyecto! 
