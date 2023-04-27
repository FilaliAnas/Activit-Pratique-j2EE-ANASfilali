<h1>Activité Pratique N°1</h1>
	<p>Ce projet contient le code développé lors de l'activité pratique n°1, qui consiste à mettre en pratique les concepts de couplage faible et d'injection de dépendances.</p>
	<h2>Prérequis</h2>
	<ul>
		<li>JDK 8 ou version ultérieure</li>
		<li>IDE (IntelliJ IDEA recommandé)</li>
		<li>Maven</li>
	</ul>
	<h2>Partie 1</h2>
	<p>La partie 1 de l'activité pratique consiste à créer une interface IDao avec une méthode getDate, une implémentation de cette interface, une interface IMetier avec une méthode calcul, et une implémentation de cette interface en utilisant le couplage faible. Ensuite, il faut faire l'injection des dépendances en utilisant les méthodes suivantes :</p>
	<ul>
		<li>Par instanciation statique</li>
		<li>Par instanciation dynamique</li>
		<li>En utilisant le Framework Spring</li>
		<ul>
			<li>Version XML</li>
			<li>Version annotations</li>
		</ul>
	</ul>
	<h2>Partie 2</h2>
	<p>La partie 2 du projet consiste à développer un mini Framework qui permet de faire l'injection des dépendances avec deux versions : XML et Annotations. Le Framework doit permettre à un programmeur de faire l'injection des dépendances entre les différents composants de son application en respectant les possibilités suivantes :</p>
	<ul>
		<li>A travers un fichier XML de configuration en utilisant Jax Binding (OXM : Mapping Objet XML)</li>
		<li>En utilisant les annotations</li>
		<li>Possibilité d'injection via :</li>
		<ul>
			<li>Le constructeur</li>
			<li>Le Setter</li>
			<li>Attribut (accès direct à l'attribut : Field)</li>
		</ul>
	</ul>
	<h2>Utilisation</h2>
	<p>Le projet ne contient pas d'application à proprement parler, il s'agit plutôt d'une mise en pratique de concepts. Vous pouvez ouvrir le projet dans votre IDE et explorer les différentes classes pour comprendre comment les concepts ont été mis en œuvre.</p>
