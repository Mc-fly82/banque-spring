package com.formation.ms2i.tp.banque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Pour se connecter à la base de données par un GUI aller à http://localhost:8080/h2-console identifiants (Password est vide).\n" +
                "\n" +
                "Driver: org.h2.Driver\n" +
                "JDBC URL: jdbc:h2:mem:testdb\n" +
                "User Name: sa\n" +
                "Password:\n");
        System.out.println("Pour générer des entrées au démarage de l'application décommenter les lignes dans tp" +
                ".banque/src/main/resources/import.sql\n");
    }
}
