package org.gradle;

public class Client {
	private String nom;
	private Voiture voiture;
	private String adresse;
	
	public Client(String nom, String Adresse){
		this.nom = nom;
		this.adresse = Adresse;
		this.voiture = new Voiture();
	}

	public String getNom() {
		return nom;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String toString(){
		return "[Nom : "+nom+ ", Adresse : "+adresse+", Voiture achetée : "+voiture+"]";
	}
}
