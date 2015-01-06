package org.gradle;

import java.util.ArrayList;


public class Stock {

	protected ArrayList<Voiture> Listevoiture;
	protected int limite;
	
	public Stock(int limitStock){
		this.Listevoiture=new ArrayList<Voiture>(limitStock);
		this.limite=limitStock;
	}
	
	public Voiture getVoiture(String marque) {
		for(int i=0; i<this.Listevoiture.size(); i++){
			if(this.Listevoiture.get(i).getModele()==marque){
				Voiture voiture = this.Listevoiture.get(i);
				return voiture;
			}
		}
		return null;
	}

	public void setVoiture(ArrayList<Voiture> voiture) {
		this.Listevoiture = voiture;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return "Stock [voiture=" + Listevoiture + ", limite=" + limite + "]";
	}

	public boolean Ajouter(Voiture voiture){
		if(this.Listevoiture.size()==this.limite)
			return false;
		
		else{
		this.Listevoiture.add(voiture);
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
