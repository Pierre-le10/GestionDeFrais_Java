Emma souhaite développer une appli Android pour simplifier la gestion de ses notes de frais. Pour commencer, elle a uniquement besoin que vous l'aidiez pour la classe FraisDeDeplacement. Vous allez écrire cette classe et la tester un peu. Pour l'application d'Emma, un frais de déplacement est caractérisé par une date (ex. 08/02/2024), une personne (ex. « John Smith »), un moyen de transport (parmi: (voiture électrique, voiture thermique ou hybride, train, RER ou tram ou métro, vélo, à pieds) ), un montant en € (ex. 125,50€), un nombre de kms (ex. 178).

1. Ecrire la classe Frais DeDeplacement pour représenter un frais de déplacement dans l'application d'Emma

(penser à définir un package). Vous intégrerez à votre classe:

tous les attributs nécessaires,

les getters et setters « standards » (certains évolueront peut-être, cf. ci-dessous)

2. Ajouter un constructeur pour initialiser tous les attributs (tous sont obligatoires).

3. Afin de vous assurez qu'Emma ne pourra pas utiliser votre classe pour créer des frais de déplacements incohérents (ex: Okms pour -2€), effectuer les modifications nécessaires dans les setters et/ou dans le constructeur afin de garantir que les instances de votre classe seront valides à tout instant. Vous pouvez par exemple envisager de lever des exceptions...

4. Ajouter à votre classe une méthode, disons get Montant EnDollars (), qui retourne le montant du frais converti en dollars au taux de change fixe de 1€=1,07635.

5. Redéfinissez la méthode toString() de façon à décrire textuellement un frais de déplacement sur le modèle de l'exemple ci-dessous: John Smith a effectué un déplacement de 178 kms le 08/02/2024.

Il a voyage en train pour un coût de 125.5 Euros

6. Définir une méthode public String toString Dollars () qui fait la même chose mais affiche le coût en dollars.

7. Ecrire un main (..) de test dans lequel vous aller successivement:

Créer un frais f1 correspondant à l'exemple ci-dessus.

Créer un second frais, disons £2, pour Emma qui a fait 8kms à pieds pour 0€ le 12/12/2023.

Afficher les descriptifs de f1 et f2 dans la console, puis les descriptifs avec les montants convertis en dollars.