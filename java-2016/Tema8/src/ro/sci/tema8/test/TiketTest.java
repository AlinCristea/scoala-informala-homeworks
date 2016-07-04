package ro.sci.tema8.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.sci.tema8.Ticket;

public class TiketTest {

	@Test
	public void testVenituriPeCategorie() {
		Ticket t = new Ticket(100, 90);
		
		int sold3 =( t.getNrBilete() - (t.getNrTicket() * 85 / 100));
		int sold1 =(t.getNrBilete()-(t.getNrBilete()-t.getNrTicket()*50/100));
		int sold2=t.getNrBilete()-(sold1+sold3);
		
		 t.venituriPeCategorie();
		
		
		int soldCategoria1=sold1*50;
		int soldCategoria2=sold2*80;
		int soldCategoria3=sold3*120;
		
		int soldTotal =soldCategoria1+soldCategoria2+soldCategoria3;
		assertEquals(2500,soldCategoria1);
		assertEquals(600,soldCategoria3);
		assertEquals(2800,soldCategoria2);

	}

}
