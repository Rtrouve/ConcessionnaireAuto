package org.gradle;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConcessionaireTest {
	
	@Test
	public void canConstructAConcessionaire()
	{
		Concessionnaire C = new Concessionnaire("Youssef",30);
		assertEquals("Youssef",C.getNom());
		assertEquals(30,C.getStock().getLimite());
		
		

		
	}
	@Test
	public void canSellAndBuy()
	{
		Concessionnaire C = new Concessionnaire("Youssef",30);
		Client c =new Client("SAIH","15 rue");
		Voiture v = new Voiture("1957",50000);
		
		
		assertEquals(true, C.Achat("Opel", 12000)); // Test Achat
		
		assertEquals(true,C.Vente(v,c)); 			// Test Vente
	}
	
	

}
