package ro.sci.tema9;

import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		//ArrayList<Alegator> b = new ArrayList<>();
		BirouElectoral bir = new BirouElectoral();
		CreateFile file=new CreateFile();
		Alegator a1 = new Alegator("32354335325", "alin", "Boc");
		Alegator a2 = new Alegator("24532646443", "dani ", "Boc");
		Alegator a3 = new Alegator("43654756455", "numedgt", "Alexa");
		Alegator a4 = new Alegator("32354335325", "alin", "Boc");
		Alegator a5 = new Alegator("46789797988", "ddgh", "Buzoianu ");
		Alegator a6 = new Alegator("32354335325", "alin", "Boc");
		Alegator a7 = new Alegator("32354335325", "alin", "Boc");
		Alegator a8 = new Alegator("32354335325", "alin", "Boc");

		bir.addAlegator(a1);
		bir.addAlegator(a2);
		bir.addAlegator(a3);
		bir.addAlegator(a4);
		bir.addAlegator(a5);
		bir.addAlegator(a6);
		bir.addAlegator(a7);
		bir.addAlegator(a8);
		
	
		
		bir.list();
		System.out.println("............");
		file.openFile();
		file.addRecords();
		file.closeFile();
		
		//int votInvalid=bir.voturiInvalide();
		//System.out.println("nr voturi invalide : "+votInvalid);
		
		System.out.println("............");
	
	
		int votBoc=bir.getVotBoc();
		System.out.println("boc are :"+votBoc+ " voturi");
		int votAlexa=bir.getVotAlexa();
		System.out.println("alexa are :"+votAlexa+ " voturi");
		System.out.println("............");
		bir.list();
		
		
		

		
		
	}

}
