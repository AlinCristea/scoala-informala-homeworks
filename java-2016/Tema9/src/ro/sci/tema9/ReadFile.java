package ro.sci.tema9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
/**
 * This is  ReadFile class which helps me to read from the file 
 * the close() method is used to close the file  
 * @author alin
 *
 */
public class ReadFile {
	public void readFileContent() throws FileNotFoundException, IOException {
		String line;
		try (InputStream fis = new FileInputStream("alegeri.txt");
				InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
				BufferedReader br = new BufferedReader(isr);) {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			fis.close();
			isr.close();
			br.close();
		}
		
	}

}
