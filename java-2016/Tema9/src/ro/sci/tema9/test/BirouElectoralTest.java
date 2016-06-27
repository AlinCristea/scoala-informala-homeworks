package ro.sci.tema9.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import ro.sci.tema9.BirouElectoral;
import ro.sci.tema9.Voter;
import org.junit.Test;

/**
 * this is a test class in which i test some methods
 * 
 * @author alin
 *
 */
public class BirouElectoralTest {
	@Test
	public void testVoter() {

		BirouElectoral bir = new BirouElectoral();

		Voter a1 = new Voter("32354335325", "alin", "Boc");
		Voter a2 = new Voter("24532646443", "dani ", "Boc");
		Voter a3 = new Voter("43654756455", "numedgt", "Alexa");
		Voter a4 = new Voter("97654335325", "aghgd", "Boc");
		Voter a5 = new Voter("46789797988", "ddgh", "Buzoianu");
		Voter a6 = new Voter("56854335325", "cvnng", "Boc");
		Voter a7 = new Voter("32385685325", "nfd", "Boc");
		Voter a8 = new Voter("325756878625", "fxkhd", "Boc");
		Voter a9 = new Voter("325755688725", "fhffh", "Buzoianu");
		bir.addAlegator(a1);
		bir.addAlegator(a2);
		bir.addAlegator(a3);
		bir.addAlegator(a4);
		bir.addAlegator(a5);
		bir.addAlegator(a6);
		bir.addAlegator(a7);
		bir.addAlegator(a8);
		bir.addAlegator(a9);
		/**
		 * Here i test the addAlegator and the returnTotalVot methods
		 */
		assertEquals(9, bir.returnTotalVot(), 0);
		/**
		 * Here i test the getVotMayer method
		 */
		assertEquals(6, bir.getVotMayer("Boc"), 0);
		assertEquals(1, bir.getVotMayer("Alexa"), 0);
		assertEquals(2, bir.getVotMayer("Buzoianu"), 0);
		/**
		 * Here i test the size of the list
		 */
		assertEquals(9, bir.getList().size(), 0);
	}

}
