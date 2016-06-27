package ro.sci.tema9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void readFromFile(){
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
		Voter a10 = new Voter("32354335325", "alin", "Boc");
		Voter a11 = new Voter("24532646443", "dani ", "Boc");
		Voter a12 = new Voter("43654756455", "numedgt", "Alexa");
		
	
		bir.addAlegator(a1);
		bir.addAlegator(a2);
		bir.addAlegator(a3);
		bir.addAlegator(a4);
		bir.addAlegator(a5);
		bir.addAlegator(a6);
		bir.addAlegator(a7);
		bir.addAlegator(a8);
		bir.addAlegator(a9);
		bir.addAlegator(a10);
		bir.addAlegator(a11);
		bir.addAlegator(a12);
		
		bir.list();
		
		bir.invalidVotes();
		bir.deliteInvalidVotes();
		System.out.println("............");
		bir.list();
		CreateFile file = new CreateFile();
		file.openFile();
		file.writeElector(bir.getList());

		file.writeString("............");

		file.writeString("boc are :" + bir.getVotMayer("Boc") + " voturi");

		file.writeString("alexa are :" + bir.getVotMayer("Alexa") + " voturi");

		file.writeString("Buzoianu  are :" + bir. getVotMayer("Buzoianu") + " voturi");
		file.writeString("............");

		file.writeString("total voturi  :" + bir.returnTotalVot());
		
file.closeFile();

	}
}
