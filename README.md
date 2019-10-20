# banque-spring
Une petite application bancaire réalisée sur le framework JAVA spring - TP .Net - Marc Flavius
## Instalation
###Step 1
Dans Eclipse ou Spring Tool Suite
importé le projet avec la commande Import > Existing Maven Projects
###Step 2
Ouvrir le fichier src/main/java/...tp.banque/Application.java
et executer Run As > Java Application

##Problèmes éventuels
1. Le port 8080 est déjà pris par un autre processus.

## Autre
pour se connecter à la base de données par un GUI
aller à http://localhost:8080/h2-console
identifiants (Password est vie).
Driver: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password:

## Projet
Base de données: H2, (in memory)
FrameWork: Spring
Spring Boot: Web,JPA,Devtools,JDBC
Addon dependencies: H2,jstl
:: Spring Boot :: (v2.2.0.RELEASE)
