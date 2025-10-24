package com.example.tp;

public class CompteCourant extends Compte {

	private double decouvertAutoriser;

	public CompteCourant(double soldeInitiale, double decouvertAutoriser) {
		super(soldeInitiale);
		this.decouvertAutoriser = decouvertAutoriser;
	}

	@Override
	public void retirer(double montant) {
		if (montant > 0 && solde + decouvertAutoriser >= montant) {
			solde -= montant;
			System.out.println("CompteCourant #" + getNumero() + " : retrait de " + montant);
		} else {
			System.out.println("CompteCourant #" + getNumero() + " : retrait impossible (découvert max dépassé)");
		}
	}
}
