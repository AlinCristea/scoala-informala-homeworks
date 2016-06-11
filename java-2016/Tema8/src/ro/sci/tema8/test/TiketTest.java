package ro.sci.tema8.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.sci.tema8.Ticket;

public class TiketTest {

	@Test
	public void testVenituriPeCategorie() {
		Ticket t=new Ticket( 100,90);
		
		t.venituriPeCategorie();
		
		int soldCategorie3=5;
		int profitCategoria3 = soldCategorie3 * 120;
	   
		
		assertEquals(600,profitCategoria3 );
		
	}

}
