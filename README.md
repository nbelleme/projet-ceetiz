# Test technique

## Contexte
Le ministère des finances vous demande de créer un programme devant permettre de calculer les impôts dus par les entreprises françaises.

Dans un premier temps, ce programme devra gérer 2 types d'entreprise :

1. Les auto-entreprises, qui ont les propriétés suivantes :

N° SIRET  
Dénomination

2. Les SAS, qui ont les propriétés suivantes :

N° SIRET  
Dénomination  
Adresse du siège social

## Règles de gestion du calcul des impôts
Le calcul des impôts devra respecter les règles de gestion suivantes :

1. Pour les auto-entreprises :

`impôts = 25% du CA annuel de l'entreprise`

2. Pour les SAS :

`impôts = 33% du CA annuel de l'entreprise`


## Compiler et lancer le programme

Pour compiler le programmer, utiliser la commande 
`mvn clean install`
Pour lancer le programme, utiliser la commande
`java -jar target/projet-ceetiz.jar`

Les informations concernant l'entreprise vous seront alors demandées. Une fois ces informations entrées, le programme 
calculera les impôts de l'entreprise automatiquement.

## Tester le programmer

Pour tester le programme, utiliser la commande :
`mvn test` 