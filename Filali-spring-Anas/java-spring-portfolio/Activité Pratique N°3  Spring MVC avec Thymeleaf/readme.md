
<h2 style="border-style: dotted;background-color: white;color:black">Spring MVC avec Thymeleaf</h2>
<h5 style="border-style: dotted;background-color: blue;color:withe" >Créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients. L'application doit permettre les fonctionnalités suivantes :
</h5>
<h1>Technologies utilisées</h1>
	<p>Cette application est développée en utilisant les technologies suivantes :</p>
	<ul>
		<li>Spring MVC : pour gérer les requêtes HTTP et les vues</li>
		<li>Thymeleaf : pour la création de pages HTML</li>
		<li>Spring Data JPA : pour la gestion des accès aux données</li>
		<li>MySQL : comme base de données</li>
	</ul>
  
<br><br><h1 style="border-style: dotted;background-color: pink;color:black" >Afficher les patients:</h2><br><br>
<img height="400" width="500" src="https://github.com/FilaliAnas/Activit-Pratique-j2EE-ANASfilali/blob/main/Filali-spring-Anas/java-spring-portfolio/java-spring-portfolio/Activité%20Pratique%20N°3%20%20Spring%20MVC%20avec%20Thymeleaf/images/indexSearch.png" /><br>
<h1 style="border-style: dotted;background-color: #f6c8c8;color:black" >Faire la pagination  :</h2><br><br>
<img height="400" width="500" src="https://github.com/FilaliAnas/Activit-Pratique-j2EE-ANASfilali/blob/main/Filali-spring-Anas/java-spring-portfolio/java-spring-portfolio/Activité%20Pratique%20N°3%20%20Spring%20MVC%20avec%20Thymeleaf/images/index.png" /><br>
<h1 style="border-style: dotted;background-color: #f6c8c8;color:black" >Ajouter les Patients:</h2><br><br>
<img height="400" width="500" src="https://github.com/FilaliAnas/Activit-Pratique-j2EE-ANASfilali/blob/main/Filali-spring-Anas/java-spring-portfolio/patient-mvc/images/addpatient.png" /><br>
<h1 style="border-style: dotted;background-color: #f6c8c8;color:black"> Modifier les Patients:</h2><br><br>
<img height="400" width="500" src="https://github.com/FilaliAnas/Activit-Pratique-j2EE-ANASfilali/blob/main/Filali-spring-Anas/java-spring-portfolio/patient-mvc/images/update.png" /><br>

<h1 style="border-style: dotted;background-color: #f6b5c1;color:black" >Chercher les Patients:</h2><br><br>
<img height="400" width="500" src="https://github.com/FilaliAnas/Activit-Pratique-j2EE-ANASfilali/blob/main/Filali-spring-Anas/java-spring-portfolio/patient-mvc/images/SearcPatient.PNG" /><br>

<h1 style="border-style: dotted;background-color: pink;color:black" >Supprimer un Patients:</h2><br><br>
<img height="500" width="400" src="https://github.com/FilaliAnas/Activit-Pratique-j2EE-ANASfilali/blob/main/Filali-spring-Anas/java-spring-portfolio/patient-mvc/images/delete.PNG" /><br>
<h1>Prérequis</h1><br>

<p>Pour exécuter cette application, vous aurez besoin des éléments suivants :</p>
<ul>
	<li>Java 8 ou supérieur</li>
	<li>Maven 3 ou supérieur</li>
	<li>MySQL</li>
</ul>

<h1>Installation</h1>
<p>Pour installer et exécuter l'application, veuillez suivre les étapes suivantes :</p>
<ol>
	<li>Clonez le référentiel Git : git clone &lt;url_du_referentiel&gt;</li>
	<li>Ouvrez une invite de commandes dans le répertoire du projet et exécutez la commande suivante pour compiler l'application : mvn clean install</li>
	<li>Configurez les informations de la base de données dans le fichier application.properties :</li>
	<pre>
		server.port=8085
		spring.datasource.url=jdbc:mysql://localhost:3306/hospital-db?createDatabaseIfNotExist=true
		spring.datasource.username=root
		spring.datasource.password=
		spring.jpa.hibernate.ddl-auto=update
		spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
		spring.mvc.format.date=yyyy-MM-dd
		spring.thymeleaf.cache=false
	</pre>
	<li>Exécutez l'application avec la commande suivante : mvn spring-boot:run</li>
	<li>Accédez à l'application en utilisant l'URL suivante : <a href="http://localhost:8085">http://localhost:8085</a></li>
</ol>
