
<h2>Activité pratique N°2 : JPA Hibernate, Spring Data</h2>
<p>Vidéo à utiliser comme ressource principale : <a href="https://www.youtube.com/watch?v=KKw2u_5nW7k">https://www.youtube.com/watch?v=KKw2u_5nW7k</a></p>
<ol>
  <li>Installer IntelliJ Ultimate</li>
  <li>Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock</li>
  <li>Créer l'entité JPA Patient ayant les attributs :
    <ul>
      <li>id de type Long</li>
      <li>nom de type String</li>
      <li>dateNaissanec de type Date</li>
      <li>malade de type boolean</li>
      <li>score de type int</li>
    </ul>
  </li>
  <li>Configurer l'unité de persistance dans le ficher application.properties</li>
  <li>Créer l'interface JPA Repository basée sur Spring data</li>
  <li>Tester quelques opérations de gestion de patients :
    <ul>
      <li>Ajouter des patients</li>
      <li>Consulter tous les patients</li>
      <li>Consulter un patient</li>
      <li>Chercher des patients</li>
      <li>Mettre à jour un patient</li>
      <li>supprimer un patient</li>
    </ul>
  </li>
  <li>Migrer de H2 Database vers MySQL</li>
</ol>
<h2>Getting Started</h2>
<h3>Prerequisites</h3>
<ul>
  <li>Java 8 or later</li>
  <li>IntelliJ Ultimate or other IDE</li>
  <li>MySQL or H2 database</li>
  <li>Web browser (Chrome, Firefox, Safari, etc.)</li>
</ul>
<h3>Installing</h3>
<ol>
  <li>Clone this repository to your local machine using <code>git clone </code>.</li>
  <li>Open the project in your IDE.</li>
  <li>Configure the database settings in <code>application.properties</code> file.</li>
  <li>Build and run the application.</li>
</ol>
<h2>Usage</h2>
<p>Once the application is up and running, you can access it through a web browser. The following operations are available:</p>
<ul>
  <li>Add new patient records.</li>
  <li>View a list of all patient records.</li>
  <li>View a specific patient record.</li>
  <li>Search for patient records based on various criteria.</li>
  <li>Update an existing patient record.</li>
  <li>Delete a patient record.</li>
</ul>
<h3>Built With</h3>
<ul>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Hibernate</li>
  <li>MySQL or H2 Database</li>
  <li>Thymeleaf</li>
  <li>Bootstrap</li>
</ul>
