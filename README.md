
# 🧮 **Héritage**

## 📘 Description

Ce document regroupe une série de projets Java illustrant des concepts avancés de la programmation orientée objet :

- Hiérarchie de classes et spécialisation

- Polymorphisme et traitement dynamique

- Encapsulation et surcharge

- Tableaux extensibles et simulation métier

- Systèmes interactifs et calculs agrégés

## 📂 Project Structure
````
projets
├── gestion_d_un_zoo/
│   └── src/com/example/tp/
│       ├── Animal.java
│       ├── Mammifere.java
│       ├── Oiseau.java
│       ├── Reptile.java
│       ├── Zoo.java
│       └── Main.java
├── GestionBibliothèque/
│   └── src/com/example/entities/
│       ├── Document.java
│       ├── Livre.java
│       ├── Roman.java
│       ├── Manuel.java
│       ├── Dictionnaire.java
│       ├── Revue.java
│       ├── Bibliotheque.java
│   └── src/com/example/test/
│       └── Main.java
├── TPInheritance/
│   └── src/com/example/tp/
│       ├── Compte.java
│       ├── CompteCourant.java
│       ├── CompteEpargne.java
│       └── Main.java
├── TPParcVehicules/
│   └── src/com/example/tp/
│       ├── Vehicule.java
│       ├── Motorise.java
│       ├── Moteur.java
│       ├── Voiture.java
│       ├── VoitureElectrique.java
│       ├── Moto.java
│       ├── Camion.java
│       ├── Flotte.java
│       └── Main.java
└── README.md
````


## ⚙️ Features

### **1.** Zoo – Hiérarchie animale et gestion dynamique
Classe Animal avec identifiant unique, nom, âge, et méthode seDeplacer()

Sous-classes :

- Mammifere → couleurFourrure, allaiter()

- Oiseau → envergure, voler()

- Reptile → typeEcailles, seChauffer()

Classe Zoo :

- Tableau extensible d’animaux

- Méthodes ajouterAnimal() et afficherTous()
### **2.** Bibliothèque – Gestion polymorphe de documents
Classe Document avec numEnreg, titre

Sous-classes :

- Livre → auteur, nbrPages

- Roman, Manuel : ajoutent prix ou niveau

- Dictionnaire → langue

- Revue → mois, année

Classe Bibliotheque :

- Ajout, suppression, recherche, affichage

- Méthode afficherAuteurs() pour extraire les auteurs de livres

Menu interactif dans Main

### **3.** Banque – Comptes spécialisés et simulation
Classe Compte avec numero, solde, deposer(), retirer(), afficherDetails()

Sous-classes :

- CompteEpargne → tauxInteret, appliquerInterets()

- CompteCourant → decouvertAutoriser, retrait redéfini

Test avec appels polymorphes et simulation de transactions

### **4.** Flotte – Véhicules motorisés et simulation de conduite
Classe Vehicule → identifiant, modèle

Classe Motorise → moteur, carburant, kilométrage

Sous-classes :

- Voiture → nbPortes, klaxonner()

- Camion → capaciteCharge, charger()

- Moto → cylindrée, faireWheelie()

- VoitureElectrique → surcharge de refuel()

Classe Flotte :

- Ajout dynamique

- Affichage de tous les véhicules

- Calcul de la distance totale parcourue
## 🖥️ Example Execution

### Hiérarchie de comptes bancaires :

### Héritage et gestion d’un zoo avec tableau dynamique d’animaux : 

### Parc de véhicules – Héritage, composition et gestion de flotte :

### Gestion d'une Bibliothèque :
##### 1. Afficher tous les documents
##### 2. Ajouter un document
##### 3. Supprimer un document
##### 4. Rechercher un document par code
##### 5. Afficher les auteurs
##### 0. Quitter

## 💡 Concepts Practiced

- L’héritage pour structurer les hiérarchies

- Le polymorphisme pour un traitement flexible

- L’encapsulation pour protéger les données

- La modularité pour simuler des systèmes réels


## 🧑‍💻 Author

- 👤 Agouram Hassan
- 🏫 Fondamentaux et Concepts Avancés de la Programmation Java – TP1
- 🎓 Instructor	Mr.LACHGAR
- 📅 23	October 2025
