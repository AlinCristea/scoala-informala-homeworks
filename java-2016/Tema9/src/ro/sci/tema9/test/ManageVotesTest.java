package ro.sci.tema9.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import ro.sci.tema9.ManageVotes;
import ro.sci.tema9.Voter;
import org.junit.Test;

/**
 * this is a test class in which i test some methods
 * 
 * @author alin
 *
 */
public class ManageVotesTest {
	@Test
	public void testVoter() {

		ManageVotes mgv = new ManageVotes();

		Voter a1 = new Voter("32354335325", "alin", "Boc");
		Voter a2 = new Voter("24532646443", "dani ", "Boc");
		Voter a3 = new Voter("43654756455", "numedgt", "Alexa");
		Voter a4 = new Voter("97654335325", "aghgd", "Boc");
		Voter a5 = new Voter("46789797988", "ddgh", "Buzoianu");
		Voter a6 = new Voter("56854335325", "cvnng", "Boc");
		Voter a7 = new Voter("32385685325", "nfd", "Boc");
		Voter a8 = new Voter("325756878625", "fxkhd", "Boc");
		Voter a9 = new Voter("325755688725", "fhffh", "Buzoianu");
		mgv.addVoter(a1);
		mgv.addVoter(a2);
		mgv.addVoter(a3);
		mgv.addVoter(a4);
		mgv.addVoter(a5);
		mgv.addVoter(a6);
		mgv.addVoter(a7);
		mgv.addVoter(a8);
		mgv.addVoter(a9);
		/**
		 * Here i test the addAlegator and the returnTotalVot methods
		 */
		assertEquals(9, mgv.returnTotalVot(), 0);
		/**
		 * Here i test the getVotMayer method
		 */
		assertEquals(6, mgv.getVotMayer("Boc"), 0);
		assertEquals(1, mgv.getVotMayer("Alexa"), 0);
		assertEquals(2, mgv.getVotMayer("Buzoianu"), 0);
		/**
		 * Here i test the size of the list
		 */
		assertEquals(9, mgv.getList().size(), 0);
	}

}
