package ro.sci.tema9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void readFromFile() {
		try {
			ReadFile readFile = new ReadFile();

			readFile.readFileContent();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		ReadFile fileRead = new ReadFile();

		try {
			fileRead.readFileContent();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("............");
		System.out.println("............");
		System.out.println("............");

		ManageVotes mng = new ManageVotes();

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

		mng.addVoter(a1);
		mng.addVoter(a2);
		mng.addVoter(a3);
		mng.addVoter(a4);
		mng.addVoter(a5);
		mng.addVoter(a6);
		mng.addVoter(a7);
		mng.addVoter(a8);
		mng.addVoter(a9);
		mng.addVoter(a10);
		mng.addVoter(a11);
		mng.addVoter(a12);

		mng.list();

		mng.invalidVotes();
		mng.deliteInvalidVotes();
		System.out.println("............");
		mng.list();
		CreateFile file = new CreateFile();
		file.openFile();
		file.writeElector(mng.getList());

		file.writeString("............");

		file.writeString("boc has :" + mng.getVotMayer("Boc") + " votes");

		file.writeString("alexa has :" + mng.getVotMayer("Alexa") + " votes");

		file.writeString("Buzoianu  has :" + mng.getVotMayer("Buzoianu") + " votes");
		file.writeString("............");
		file.writeString( mng.validationMayor(null));

		file.writeString("total voturi  :" + mng.returnTotalVot());
		
		file.closeFile();
		
	}
}
