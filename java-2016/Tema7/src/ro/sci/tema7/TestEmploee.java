package ro.sci.tema7;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestEmploee {


	@Test
	public void testListNull() {
		ArrayList<Emploee> parking = new ArrayList<>();
		Company c = new Company();
		//Emploee e=new Emploee("viorel", 3, false, "inginer");
		//c.addEmploee(e);
		c.parkingList();
	}

	}
	/*
	/**
	 * This method tests if the correct elements are added 
	 * to the list if it displays correctly
	 */
/*
	@Test
	public void testParking() {
		ArrayList<Emploee> parking = new ArrayList<>();
		Company c = new Company();

		Emploee e=new Emploee("viorel", 3, false, "inginer");
		
		Emploee e1=new Emploee("dan", 4, true, "inginer");

		Emploee e2=new Emploee("calin", 2, false, "manager");

		Emploee e3=new Emploee("beni", 6, true, "inginer");

		Emploee e4=new Emploee("dorel", 8, true, "manager");

		Emploee e5=new Emploee("lore", 5, false, "inginer");

		 c.addEmploee(e);
	        c.addEmploee(e1);
	        c.addEmploee(e2);
	        c.addEmploee(e3);
	        c.addEmploee(e4);
	        c.addEmploee(e5);
	        
		c.parkingList();

	}

	

}
*/
