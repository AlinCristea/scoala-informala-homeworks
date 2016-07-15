package ro.sci.thred;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		System.out.println("............");
		System.out.println("............");
		System.out.println("............");

		ManageVotes bir = new ManageVotes();

		Voter a1 = new Voter("32354335325", "alin", "Boc");
		Voter a2 = new Voter("24532646443", "dani ", "Boc");
		Voter a3 = new Voter("43654756455", "numedgt", "Alexa");
		Voter a4 = new Voter("97654335325", "aghgd", "Boc");
		Voter a5 = new Voter("46789797988", "ddgh", "Buzoianu");
		Voter a6 = new Voter("56854335325", "cvnng", "Boc");
		Voter a7 = new Voter("32385685325", "nfd", "Boc");
		Voter a8 = new Voter("325756878625", "fxkhd", "Boc");
		Voter a9 = new Voter("325755688725", "fhffh", "Buzoianu");
		Voter a10 = new Voter("32354335325", "alin", "Boc");
		Voter a11 = new Voter("24532646443", "dani ", "Boc");
		Voter a12 = new Voter("43654756455", "numedgt", "Alexa");

		ArrayList<Voter> thredList = new ArrayList<>();
		thredList.add(a1);
		thredList.add(a2);
		thredList.add(a3);
		thredList.add(a4);
		thredList.add(a5);
		thredList.add(a6);
		thredList.add(a7);
		thredList.add(a8);
		thredList.add(a9);
		thredList.add(a10);
		thredList.add(a11);
		thredList.add(a12);

		MyThred m = new MyThred(bir);
		try {
			m.startThred(thredList);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/**
		 * bir.list();
		 * 
		 * bir.invalidVotes(); bir.deliteInvalidVotes();
		 * System.out.println("............"); bir.list(); System.out.println(
		 * "total votes "+bir.returnTotalVot());
		 *  bir.validationMayor();
		 */
	}

}
