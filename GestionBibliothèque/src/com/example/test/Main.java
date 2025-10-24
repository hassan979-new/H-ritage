package com.example.test;

import com.example.entities.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bibliotheque biblio = new Bibliotheque(10);

		// Documents initiaux
		biblio.ajouter(new Roman("Les Misérables", "Victor Hugo", 1200, 120));
		biblio.ajouter(new Manuel("Mathématiques", "A. Dupont", 300, "Lycée"));
		biblio.ajouter(new Dictionnaire("Larousse", "Français"));
		biblio.ajouter(new Revue("Science & Vie", "june", 2025));

		int choix;
		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1. Afficher tous les documents");
			System.out.println("2. Ajouter un document");
			System.out.println("3. Supprimer un document");
			System.out.println("4. Rechercher un document par code");
			System.out.println("5. Afficher les auteurs");
			System.out.println("0. Quitter");
			System.out.print("Choix : ");
			choix = sc.nextInt();
			sc.nextLine();

			switch (choix) {
			case 1 -> biblio.afficherDocuments();
			case 2 -> {
				System.out.print("Type (roman, manuel, dictionnaire, revue) : ");
				String type = sc.nextLine();
				System.out.print("Titre : ");
				String titre = sc.nextLine();

				switch (type.toLowerCase()) {
				case "roman" -> {
					System.out.print("Auteur : ");
					String auteur = sc.nextLine();
					System.out.print("Pages : ");
					int pages = sc.nextInt();
					sc.nextLine();
					System.out.print("prix : ");
					double prix = sc.nextDouble();
					biblio.ajouter(new Roman(titre, auteur, pages, prix));
				}
				case "manuel" -> {
					System.out.print("Auteur : ");
					String auteur = sc.nextLine();
					System.out.print("Pages : ");
					int pages = sc.nextInt();
					sc.nextLine();
					System.out.print("Niveau : ");
					String niveau = sc.nextLine();
					biblio.ajouter(new Manuel(titre, auteur, pages, niveau));
				}
				case "dictionnaire" -> {
					System.out.print("Langue : ");
					String langue = sc.nextLine();
					biblio.ajouter(new Dictionnaire(titre, langue));
				}
				case "revue" -> {
					System.out.print("Mois : ");
					String mois = sc.nextLine();
					System.out.print("Année : ");
					int annee = sc.nextInt();
					sc.nextLine();
					biblio.ajouter(new Revue(titre, mois, annee));
				}
				default -> System.out.println("Type inconnu.");
				}
			}
			case 3 -> {
				System.out.print("Code du document à supprimer : ");
				int code = sc.nextInt();
				Document d = biblio.document(code);
				if (d != null && biblio.supprimer(d)) {
					System.out.println("Document supprimé.");
				} else {
					System.out.println("Document introuvable.");
				}
			}
			case 4 -> {
				System.out.print("Code à rechercher : ");
				int code = sc.nextInt();
				Document d = biblio.document(code);
				System.out.println(d != null ? d : "Document non trouvé.");
			}

			case 5 -> biblio.afficherAuteurs();
			case 0 -> System.out.println("Fin du programme.");
			default -> System.out.println("Choix invalide.");
			}
		} while (choix != 0);
		sc.close();
	}
}
