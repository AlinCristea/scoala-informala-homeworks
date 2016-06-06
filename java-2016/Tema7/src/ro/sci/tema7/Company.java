package ro.sci.tema7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.SynchronousQueue;
/**
 * This class contains three ArrayList that store employees depending
 *  on the role and parking and a list that contains all employees
 * @author alin
 *
 */
public class Company  {
	ArrayList<Emploee> empl = new ArrayList<>();
	ArrayList<Emploee> parking  = new ArrayList<>();
	ArrayList<Emploee> meneger  = new ArrayList<>();
	ArrayList<Emploee> ingineri = new ArrayList<>();
/**
 * This method adds employees list
 * @param e
 */
	public  void addEmploee(Emploee e){
		empl.add(e);
		if (e.rol.equals("manager"))
			meneger.add(e);
		if (e.rol.equals("inginer"))
			ingineri.add(e);
		if (!e.parking){
			parking.add(e);
		
		sortParking();
		
		}
	}
	/**
	 * This method sorts the employees by age
	 */
	public void sortParking(){
		Collections.sort(parking, new Comparator<Emploee>(){
			@Override
			public int compare(Emploee e1, Emploee e2) {
				
				

				// ascending order
				 return (int) (e1.varsta-e2.varsta);

				// descending order
				//return id2.compareTo(id1);
			}

			
		});
	
		
	}
	/**
	 * This method returns a list of all employees as well as lists of 
	 * employees depending on their role in company
	 */
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
		
	/** 
	 *This method returns a list of employees who do not have parking
	 * ordered by seniority in the company
	 */
	
	
	public void parkingList() {
		for (Emploee emploee : parking) {
			
			System.out.println(emploee.name + " " + emploee.rol+ "  "+emploee.varsta+ " "+emploee.parking);
		}
	}
		

	
}
