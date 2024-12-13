# spring-boot-user-registration-and-Login

What we have to build?

We have build two main functionalities:

Register user (stored data into MySQL database). 
Login Authentication - validate user login credentials with database email and password. 
We will secure the Registered Users Page with role-based Spring Security.

## Agregar un etorno de desarrollo para SpringBoot
- Agrega a pom.xml el siguiente codigo:
```
<dependency>
  <groupId>io.github.cdimascio</groupId>
  <artifactId>dotenv-java</artifactId>
  <version>3.0.2</version>
</dependency>
```
  - Actualiza tu application.properties:
```
spring.datasource.url=jdbc:mysql://localhost:3306/nombreDeTuBaseDeDatos
spring.datasource.username=${SPRING_DATASOURCE_USERNAME}
spring.datasource.password=${SPRING_DATASOURCE_PASSWORD}

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
```

- Agrega un .env en tu gitignore.
- Crea un archivo llamado: .env en la raiz de tu proyecto.
- Agrega lo siguiente a tu archivo: .env
```
SPRING_DATASOURCE_USERNAME=tuUsuario
SPRING_DATASOURCE_PASSWORD=tuContraseña
```

  ## Y listo ya tienes configurado tu entorno de desarrollador! Happy Programman

