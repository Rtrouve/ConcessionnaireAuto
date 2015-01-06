package org.gradle;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConcessionaireTest {
	
	public void canConstructAConcessionaire()
	{
		Concessionnaire C = new Concessionnaire("NAME",30);
		assertEquals("NAME",C.getNom());
		assertEquals(30,C.getStock());
		
	}

}
