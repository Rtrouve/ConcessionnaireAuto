package org.gradle;

import java.util.ArrayList;

public class Concessionnaire {
	private String nom;
	private Stock stock;
	private int bilan;
	private int nboperation;
	private ArrayList<Client> ListeClient;
	
	public Concessionnaire(String nom, int limiteStock){
		this.nom = nom;
		this.stock = new Stock(limiteStock);
		this.bilan = 0;
		this.nboperation = 0;
		this.ListeClient = new ArrayList<Client>();
	}
	
	public boolean Achat(String marque, int prix){
		Voiture voiture = new Voiture(marque, prix);
		if(this.stock.Ajouter(voiture)){
			this.bilan-=prix;
			this.nboperation++;
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public boolean Vente(Voiture voiture, Client client){
		if(this.stock.Supprimer(voiture)){
			client.setVoiture(voiture);
			this.ListeClient.add(client);
			this.bilan+=voiture.getPrix();
			this.nboperation++;
			
			return true;
		}
		else{
			return false;
		}
	}
	
<<<<<<< HEAD
=======
	public String bilan(){
		return "Bilan :"+this.bilan;
	}

>>>>>>> origin/master
	@Override
	public String toString() {
		return "Concessionnaire [nom=" + nom + ", bilan=" + bilan
				+ ", nboperation=" + nboperation + ", ListeClient="
				+ ListeClient + "]";
	}

	public String getNom() {
		return nom;
	}

	public Stock getStock() {
		return stock;
	}

	public int getBilan() {
		return bilan;
	}

	public int getNboperation() {
		return nboperation;
	}

	public ArrayList<Client> getListeClient() {
		return ListeClient;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void setBilan(int bilan) {
		this.bilan = bilan;
	}

	public void setNboperation(int nboperation) {
		this.nboperation = nboperation;
	}

	public void setListeClient(ArrayList<Client> listeClient) {
		ListeClient = listeClient;
	}
	
	
	
}
