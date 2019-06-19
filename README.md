# Spring-Framework-Demo
This project is useful for starting to Spring Framework.

# CREATE PROJECT #
1. Go to https://start.spring.io/
2. Select 
      Project: Maven Project, 
      Language: Java, 
      Spring Boot: 2.1.6,
      Packaging: Jar
      Java: 11
      Dependencies: Spring Web Starter
                    Lombok
                    Spring Data JPA 
                    Spring Boot DevTools
3. Generate the project

# SET CONFIGURATIONS #

1. Open 'pom.xml' and insert to code
        <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>ojdbc8</artifactId>
            <version>12.2.0.1</version>
        </dependency>
    
2. Create a directory named 'lib' in src
3. Insert ojdbc8.jar to 'lib' directory
4. Open 'application.properties' and insert to code

            # spring
            spring.devtools.restart.poll-interval=4000
            server.servlet.context-path=/api

            # logging
            logging.level.org.hibernate.SQL=debug

            # oracle
            spring.jpa.database-platform=org.hibernate.dialect.Oracle10gDialect
            spring.datasource.url= jdbc:oracle:thin:@localhost:1521/furkan.project.com
            spring.datasource.username= USER_NAME
            spring.datasource.password= PSW
            spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
            
5. Open CMD and run 'mvnw spring-boot:run' in project files
