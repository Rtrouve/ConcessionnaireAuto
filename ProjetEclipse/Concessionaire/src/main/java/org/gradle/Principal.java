package org.gradle;

public class Principal {

	public static void main(String[] args) {
		Concessionaire c = new Concessionaire ("Test",20);
		Affichage aff = new Affichage(c);
		
		aff.affichageMenu();// option 1)(Consulter le stock) le stock est vide
		aff.affichageMenu();//  option 2)(Achat/Vente), puis acheter et rentrer la marque et le prix
		aff.affichageStock();// ou affichageMenu puis option 1)(Consulter le stock), on voit la voiture dans le stock
		aff.affichageMenu();//ensuite ou peut refaire l'option 2)(Achat/Vente), mais maintenant vente (avec la même marque 
		//que lors de l'achat sinon un message d'erreur s'affiche, puis rentrer le client qui veut l'acheter
    aff.affichageMenu();// option 3)(Bilan), pour afficher la balance (après l'achat et la vente de voiture)

	}

}
