package org.gradle;

import java.util.ArrayList;


public class Stock {

	protected ArrayList<Voiture> voiture;
	protected int limite;
	
	public Stock(int limitStock){
		this.voiture=new ArrayList<Voiture>(limitStock);
		this.limite=limitStock;
	}
	
	public ArrayList<Voiture> getVoiture() {
		return voiture;
	}

	public void setVoiture(ArrayList<Voiture> voiture) {
		this.voiture = voiture;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return "Stock [voiture=" + voiture + ", limite=" + limite + "]";
	}

	public boolean Ajouter(Voiture voiture){
		if(this.voiture.size()==this.limite)
			return false;
		
		else{
		this.voiture.add(voiture);
		return true;
		}
	}
	
	public boolean Supprimer(Voiture voiture){
		
		if (this.voiture.isEmpty())
			return false;
		
		else{
		this.voiture.remove(voiture);
		return true;
		}
	}
}
