package ro.sci.tema9;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Formatter;

public class CreateFile {
	private Formatter file;

	public void openFile() {
		try {
		file = new Formatter("alegeri.txt");

		} catch (Exception e) {
			System.out.println("You have an error ");
		}
	}

	public void addRecords() {
		//Alegator a = new Alegator("cnp", "nume", "primar");
		ArrayList<Alegator> alegatorList = new ArrayList<>();
		for (Alegator a : alegatorList) {
			 String cnp= a.getCnp();
			 String nume= a.getNume();
			 String numePrimar= a.getPrimar();

			file.format("%s,%s,%s.\n", cnp, nume, numePrimar);
		}

	}

	public void closeFile() {
		file.close();
	}

}
