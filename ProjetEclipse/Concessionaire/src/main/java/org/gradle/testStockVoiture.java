
public class testStockVoiture{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stock s=new Stock(2);
		System.out.println(s);
		Voiture v=new Voiture("opel",200);
		System.out.println(v);
		s.Ajouter(v);
		s.Ajouter(v);
		s.Ajouter(v);
		System.out.println(s);
		s.Supprimer(v);
		System.out.println(s);
		s.Supprimer(v);
		System.out.println(s);
		s.Supprimer(v);
		System.out.println(s);
	}

}
