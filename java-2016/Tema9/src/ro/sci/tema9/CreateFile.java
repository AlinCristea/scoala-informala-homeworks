package ro.sci.tema9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Formatter;
/**
 * In CreateFile  class I created a file , I open this  file ,write in file ,close the file
 * @author alin
 *
 */
public class CreateFile {
	private Formatter file;
/**
 * This method is used to open a file 
 */
	public void openFile() {
		try {
			file = new Formatter("alegeri.txt");

		} catch (Exception e) {
			System.out.println("You have an error ");
		}
	}
/**
 * This method write in the file 
 * @param electorList
 */
	public void writeElector(ArrayList<Voter> electorList) {
			for (Voter a : electorList) {
			String cnp = a.getCnp();
			String name = a.getNume();
			String mayorName = a.getPrimar();

			file.format("%s,%s,%s.\n", cnp, name, mayorName);
		}
	}
/**
 * This method is used to write in the file,and it displays a massage
 *
 * @param message
 */
	public void writeString(String message)
	{
		System.out.println(message);
		file.format("%s.\n", message);
	}
	/**
	 * This  method is used to close the file 
	 */
	public void closeFile() {
		file.close();
	}

}