package org.gradle;

public class Voiture {

	protected String modele;
	protected int prix;
	
	public Voiture(String modele,int prix){
		this.modele=modele;
		this.prix=prix;
	}
	
	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	@Override
	public String toString() {
		return "Voiture [modele=" + modele + ", prix=" + prix + "]";
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}
