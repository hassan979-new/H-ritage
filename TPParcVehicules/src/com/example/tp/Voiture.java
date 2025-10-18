package com.example.tp;

public class Voiture extends Motorise{
	private int nbPortes;

	public Voiture(String modele, Moteur moteur, double niveauCarburant, int nbPortes) {
		super(modele, moteur, niveauCarburant);
		this.nbPortes = nbPortes;
	}
	
	public void klaxonner() {
        System.out.println(modele + " klaxonne : « Pouet ! »");
    }

    @Override
    public String toString() {
        return super.toString() 
            + " {Voiture, portes=" + nbPortes + "}";
    }
}
