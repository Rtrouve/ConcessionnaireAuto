package org.gradle;

public class Affichage {
	private Concessionaire c;
	private Stock s;
	
	public Affichage(Concessionaire conce){
		c=conce;
		s=conce.getStock();
	}
	
	public void affichageStock(){
		System.out.println(c.toString());
		System.out.println("Le stock est :");
		if(s.getList().isEmpty()){
			System.out.println("vide");
		}
		else{
			for (Voiture v : s.getList()){
				System.out.println("- "+v.toString());
			}
		}
	}
}
