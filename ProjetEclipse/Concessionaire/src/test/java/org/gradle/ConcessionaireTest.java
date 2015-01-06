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

}
