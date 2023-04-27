
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
