package org.gradle;
import org.junit.Test;
import static org.junit.Assert.*;

public class VoitureTest {
	 @Test
	 public void canConstructACar()
		{
			Voiture uneVoiture = new Voiture();
			assertEquals("",uneVoiture.getModele());
			assertEquals(0, uneVoiture.getPrix());
			
		}
	 
	public void canConstructACarParam()
		{
		Voiture uneVoiture = new Voiture("1978",25000);
		assertEquals("1978",uneVoiture.getModele());
		assertEquals(25000, uneVoiture.getPrix());
		
		}
	
	
	 
	

}
