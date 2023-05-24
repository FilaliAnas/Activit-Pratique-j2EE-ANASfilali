# Compte rendu : 
# Application de gestion des patients sécurisée avec Spring Security

Ce projet est une application web qui permet de gérer les dossiers des patients. Elle permet aux utilisateurs de consulter, ajouter, mettre à jour et supprimer des informations sur les patients.

## Fonctionnalités

- Connexion sécurisée avec Spring Security
- Trois stratégies d'authentification utilisées : InMemoryAuthentication, JdbcAuthentication et UserDetailsService
- Affichage de la liste des patients
- Recherche de patients
- Ajout d'un nouveau patient
- Mise à jour d'un patient existant
- Rôles d'utilisateurs pour restreindre les fonctionnalités

## Technologies utilisées

- Java
- Spring Boot
- Spring Security
- Thymeleaf (pour les pages HTML)
- MySQL (base de données)

## Configuration de l'application

1. Cloner le référentiel GitHub : `git clone https://github.com/mohamedYoussfi/unsecured-hospital-app.git`
2. Importer le projet dans votre IDE préféré (Eclipse, IntelliJ, etc.).
3. Configurer la base de données MySQL en modifiant le fichier `application.properties` avec les informations de connexion appropriées.
4. Exécuter l'application à partir de votre IDE ou en utilisant la commande Maven : `mvn spring-boot:run`


### Interface 1: Login Page

The login page allows users to log in to the application using their username and password.

![Login Page](Filali-spring-Anas/java-spring-portfolio/secured-hospital-app-main/images/login.png)

### Interface 2: Show All Patients

The "Show All Patients" page displays a list of all patients in the database. Users can view patient details and edit or delete individual records.

![Show All Patients](Filali-spring-Anas/java-spring-portfolio/secured-hospital-app-main/images/index.png)

### Interface 3: Search

The index page also has a search functionnality.

![Show All Patients](secured-hospital-app-main/images/indexSearch.png)

### Interface 4: Add a New Patient

The "Add a New Patient" page allows users to add a new patient record to the database.

![Add a New Patient](Filali-spring-Anas/java-spring-portfolio/secured-hospital-app-main/images/addpatient.png)

### Interface 5: Update an Existing Patient

The "Update Patient" page allows users to edit an existing patient record in the database.

![Update an Existing Patient](Filali-spring-Anas/java-spring-portfolio/secured-hospital-app-main/images/update.png)

### Interface 6: Login as normal user

A normal user is not allowed to add , delete or update a patient record.

![Normal user](Filali-spring-Anas/java-spring-portfolio/secured-hospital-app-main/images/auth_normal_user.png)

