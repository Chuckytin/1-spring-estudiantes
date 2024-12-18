# Control de Estudiantes

Este es un mini proyecto CRUD (Create, Read, Update, Delete) desarrollado con **Spring Boot**, **Thymeleaf**, **Hibernate/JPA** y **MySQL**. 

## Características

- Crear nuevos estudiantes.
- Mostrar una lista de estudiantes registrados.
- Editar la información de un estudiante existente.
- Eliminar estudiantes.
- Uso de Bootstrap para una interfaz sencilla y responsiva.

## Requisitos Previos

Antes de ejecutar este proyecto, asegúrate de tener instalado lo siguiente:

- **Java 17** o superior
- **Maven** (para gestionar dependencias)
- **MySQL** (como base de datos)
- Una herramienta como **Postman** o un navegador para probar el sistema.

## Configuración de la base de datos
spring.datasource.url=jdbc:mysql://localhost:3306/bd_crud_spring
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA

## Dialecto de Hibernate para MySQL
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

## No recrear tablas automáticamente
spring.jpa.hibernate.ddl-auto=none

## Mostrar consultas SQL en consola
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
