package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;


public class AffichageTest {
	@Test
    public void canConstructAnAffichage() {
		Concessionaire c = new Concessionaire("test",20);
        Affichage aff = new Affichage(c);
        assertEquals(c, aff.getConcessionaire());
    }
}
