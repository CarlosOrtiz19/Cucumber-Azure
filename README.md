# Cucumber-Azure
-BDD
BDD est une approche qui spécifie de manière collaborative le comportement souhaité du système. Chaque fois qu'un comportement est convenu, nous utilisons cette spécification pour «conduire» le développement du code qui implémentera ce comportement.

Trois pratiques du BDD?
Nous commençons par découvrir en collaboration l'étendue du comportement requis par story. Une fois que nous nous sommes mis d'accord sur ce comportement, nous formulons la spécification dans un langage lisible par l'entreprise. Enfin, nous automatisons la spécification formulée pour vérifier que le système se comporte réellement comme prévu.

Lien entre le concombre et le BDD

Cucumber est un outil qui comprend votre documentation et la transforme en tests automatisés.
BDD est une approche collaborative, composée de trois pratiques. Les praticiens BDD peuvent utiliser Cucumber pour automatiser leur documentation.

 «documentation vivante»
«Documentation vivante» nous indique automatiquement quand le système et la documentation ne sont pas synchronisés. Cela peut être pour l'une des raisons suivantes:
    • le comportement spécifié n'a pas encore été implémenté
    • l'implémentation contient un défaut
    • la documentation est obsolète

Relation entre BDD et agile?
BDD est un ensemble de pratiques qui s'appuient sur des méthodes de travail agiles, aidant les équipes à réussir. Pour que ces pratiques génèrent de la valeur, vous devez travailler de manière agile.

User Stories aident une équipe à faire du BDD
Les user stories ont été créées pour être des «espaces réservés pour une conversation». Ils nous permettent de reporter une analyse détaillée jusqu'à ce que nous soyons certains que le comportement qu'ils décrivent doit réellement être développé.

“Three Amigos”
Le but d'une réunion à trois amigos est de s'assurer que l'équipe comprend parfaitement la portée de l'histoire discutée. Pour que cela soit efficace, nous devons avoir au moins trois perspectives différentes représentées à la réunion.
Plus de trois personnes peuvent assister à une réunion à trois amis, car:
    • certaines histoires sont suffisamment larges pour exiger la contribution de plus de trois perspectives
    • plus d'un représentant de chaque perspective peut assister
    • Qui sont les trois amigos?
    • Cette réponse est correcte.
Les trois perspectives essentielles requises sont:
    • perspective client / entreprise - généralement fournie par le Product Owner
    • perspective de développement - généralement fournie par un développeur
    • perspective de test - généralement fournie par un testeur

But du three amigos
Le but de la réunion des trois amigos est de découvrir des choses sur l'histoire qui n'étaient pas évidentes auparavant. Nous devrions nous attendre à apprendre de nouvelles choses lors d'une réunion de trois amigos.

Compétences de test 
Cela nous permet de poser des questions difficiles de style «et si» qui garantissent que nous avons réfléchi à l'histoire en détail. L'équipe utilise des exemples concrets pour tester sa compréhension de ce qu'on lui demande de fournir, tout en testant également la compréhension du propriétaire du produit de la fonctionnalité qu'il demande.

Gherkin
Gherkin est une syntaxe simple qui permet aux équipes d'écrire des spécifications exécutables lisibles pour l'entreprise.
Certains des mots-clés Gherkin sont Given, When,  Then,  mais tout le texte qui utilise ces mots n'est pas Gherkin.
Gherkin est compris par un grand nombre d'outils, notamment Cucumber et Specflow, qui transforment efficacement la spécification en tests automatisés.

relation entre un scénario et un exemple

Pendant trois amigos, l'équipe utilise des exemples concrets pour s'assurer qu'ils ont une compréhension commune de la fonctionnalité qu'ils sont sur le point de développer. Ces exemples concrets sont formulés dans des scénarios Gherkin.
Ainsi, chaque scénario est un exemple.
Le scénario et l'exemple sont tous deux des mots-clés dans Gherkin.

avantage d’utiliser Gherkin pour exprimer nos exemples dans BDD

Gherkin n'est qu'une façon d'exprimer des exemples de la façon dont vous voulez que votre système se comporte. L'avantage d'utiliser ce format particulier est que vous pouvez utiliser Cucumber pour les tester pour vous, en les transformant en documentation vivante.
Les mots-clés Gherkin Given, When et Then, nous permettent d'exprimer trois composants différents d'un scénario.
Lorsque nous écrivons la partie Scénario de notre Gherkin, nous devons nous concentrer sur le comportement observable et testable du système que nous construisons.


11/6/2020
References pour configuration de base 

https://www.youtube.com/watch?v=at6kDEwSqwQ (Spanish )

Cucumber con Java Iniciacion
La video explique la configuration de base pour commencer avec Cucumber: dépendances, annotations, @Given @When @then

https://www.baeldung.com/cucumber-spring-integration
-Maven dependences 
-configuration de base
- configuration  scenario 
-rest controller

Problems
io.cucumber.core.exception.CucumberException: 

Classes annotated with @RunWith(Cucumber.class) must not define any
Step Definition or Hook methods. Their sole purpose is to serve as
an entry point for JUnit. Step Definitions and Hooks should be defined
in their own classes. This allows them to be reused across features.
Offending class: class CucumberTest

https://testingneeds.wordpress.com/tag/cucumberoptions/
cucumber options



