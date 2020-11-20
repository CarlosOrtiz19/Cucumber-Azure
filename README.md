# Azure
Création compte azure.
https://azure.microsoft.com/fr-ca/free

Références
1.	https://www.youtube.com/watch?v=-tia-ZaprHQ

-	Install azure, 
-	Az login -> cli azure 
-	Build spring project mvn -> mvn package 
-	Création .jar => mvn azure-web-app:config => modification <princingTier>
-	mvn azure-web-app:deploy 

2.	https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/spring-boot-starters-for-azure
-adition des <properties> au pom
-addition du <plugin> 
<plugin>
  	<groupId>com.microsoft.azure</groupId>
  	<artifactId>azure-webapp-maven-plugin</artifactId>
  <version>1.7.0</version> 
</plugin>

3.	Azure Toolkit for IntelliJ Microsoft

Install azure tollkit -> Intelllij > plugins  search : azure => Install => restart 
 

Requêtes et plan demo
https://eq1-420-565-1605853601819.azurewebsites.net/employeurs/getById/4
https://eq1-420-565-1605853601819.azurewebsites.net/employeurs/findAll
https://eq1-420-565-1605853601819.azurewebsites.net/stages/findAll



