package com.example.entities;

public class Document {
	private static int compteur;
	protected final int numEnreg;
	protected String titre;
	
	
	public Document(String titre) {
		this.numEnreg = ++compteur;
		this.titre = titre;
	}


	@Override
	public String toString() {
		return "Document [numEnreg=" + numEnreg + ", titre=" + titre + "]";
	}
	
}
