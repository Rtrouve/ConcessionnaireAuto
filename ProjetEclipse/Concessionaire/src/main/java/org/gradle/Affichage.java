package org.gradle;
import java.util.Scanner;

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
	
	public void affichageMenu(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que voulez-vous faire ?\n1) Consultez le stock\n2) Achat/Vente de voiture\n3) Bilan");
		String reponse = sc.nextLine();
		if(reponse=="1"){
			this.affichageStock();
		}else if(reponse=="2"){
			System.out.println("Vous voulez :\n1) Acheter une voiture\n2)Vendre une voiture");
			reponse = sc.nextLine();
			if(reponse=="1"){
				System.out.println("Quelle marque ?");
				String marque = sc.nextLine();
				System.out.println("Quelle prix ?");
				int prix = sc.nextInt();
				if(c.Achat(marque,prix))
					System.out.println("Voiture "+marque+" achetée à "+prix+" euros.");
				else
					System.out.println("Erreur:Voiture "+marque+" non achetée");
			}else if(reponse=="2"){
				System.out.println("Quelle marque ?");
				String marque = sc.nextLine();
				System.out.println("Quelle prix ?");
				int prix = sc.nextInt();
				Voiture v =new Voiture(marque,prix);
				Client cl = questionClient();
				if(c.Vente(v,cl))
					System.out.println("Voiture "+marque+" vendu à "+prix+" euros .");
				else
					System.out.println("Erreur:Voiture "+marque+" non vendu");
			}else{
				System.out.println("Erreur");
			}
		}else if(reponse=="3"){
			c.bilan();
		}else{
			System.out.println("Erreur");
		}
	}
	public Client questionClient(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle est le nom du client ?");
		String nom=sc.nextLine();
		System.out.println("Quelle est l'adresse du client ?");
		String adresse=sc.nextLine();
		return new Client(nom,adresse);
	}
	
	public Concessionaire getConcessionaire(){
		return c;
	}
}
