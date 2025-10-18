package com.example.entities;



public class Bibliotheque {
	private int capacite;
	private int nbDocuments;
	private Document[] documents;
	
	
	public Bibliotheque(int capacite) {
		this.capacite = capacite;
		this.nbDocuments = 0;
		this.documents = new Document[capacite];
	}
	
	public void afficherDocuments() {
		for (int i = 0; i < nbDocuments; i++) {
			System.out.println(documents[i]);
		}
	}
	
	public boolean ajouter(Document doc) {
		if (doc==null || nbDocuments>capacite) {
			return false;
		}
		if (nbDocuments<=capacite) {
			documents[nbDocuments++]=doc;
		}
		return true;
	}
	
	public boolean supprimer(Document doc) {
		if (doc!=null) {
			for (int i = 0; i < documents.length; i++) {
				if (documents[i].equals(doc)) {
					for (int j = i; j < documents.length-1; j++) {
						documents[j]=documents[j+1];
					}
					documents[capacite]=null;
					nbDocuments--;
					return true;
				}
			}
		}
		
		return false;
	}
	
	public Document document(int numEnrg) {
		for (int i = 0; i < documents.length; i++) {
			if (documents[i].numEnreg==numEnrg) {
				return documents[i];
			}
		}
		return null;
	}
	
	public void afficherAuteurs() {
	    System.out.println("Liste des auteurs :");
	    for (int i = 0; i < capacite; i++) {
	        Document doc = documents[i];
	        if (doc instanceof Livre) {
	            Livre livre = (Livre) doc;
	            System.out.println("- " + livre.getAuteur());
	        }
	    }
	}

}
