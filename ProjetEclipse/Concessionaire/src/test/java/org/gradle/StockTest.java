package org.gradle;
import org.junit.Test;
import static org.junit.Assert.*;

public class StockTest {
	@Test
	public void canConstructAStock()
	{
		Stock S = new Stock(40);
		assertEquals(30,S.getLimite());
	}

}
