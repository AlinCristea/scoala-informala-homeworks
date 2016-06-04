package ro.sci.tema7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.SynchronousQueue;

public class Company  {
	ArrayList<Emploee> empl = new ArrayList<>();
	ArrayList<Emploee> parking  = new ArrayList<>();
	ArrayList<Emploee> meneger  = new ArrayList<>();
	ArrayList<Emploee> ingineri = new ArrayList<>();
	
	public  void addEmploee(Emploee e){
		empl.add(e);
		if (e.rol.equals("manager"))
			meneger.add(e);
		if (e.rol.equals("inginer"))
			ingineri.add(e);
		if (!e.parking)
			parking.add(e);
		
		sortParking();
	}
	public void sortParking(){
		Collections.sort(parking, new Comparator<Emploee>(){
			@Override
			public int compare(Emploee e1, Emploee e2) {

				// ascending order
				 return e1.compareTo(e2);

				// descending order
				//return id2.compareTo(id1);
			}

			
		});
	
		
	}
	public void printList(){
		System.out.println("lista angajati ");
		for (Emploee emploee : empl) {
			
			System.out.println(emploee.name + " " + emploee.rol+ "  "+emploee.varsta+ " "+emploee.parking);
		}
		System.out.println();
		System.out.println("lista parking");
		for (Emploee emploee : parking) {
			
			System.out.println(emploee.name + " " + emploee.rol+ "  "+emploee.varsta+ " "+emploee.parking);
		}
		System.out.println();
		System.out.println("lista ingineri ");
		for (Emploee emploee : ingineri) {
			
			System.out.println(emploee.name + " " + emploee.rol+ "  "+emploee.varsta+ " "+emploee.parking);
		}
		System.out.println();
		System.out.println("lista manageri ");
		for (Emploee emploee : meneger) {
			System.out.println(emploee.name + " " + emploee.rol+ "  "+emploee.varsta+ " "+emploee.parking);
		}
	}

	
}
