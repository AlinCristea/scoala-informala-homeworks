package ro.sci.tema7;

public class Emploee implements Comparable<Emploee>{
	
	String name ;
	int varsta ;
	boolean parking;
	String rol;
	
	
	public Emploee(String name,int varsta,boolean parking,String rol){
		this.name=name ;
		this.varsta=varsta;
		this.parking=parking;
		this.rol=rol;
		
	}


	
	@Override
	public int compareTo(Emploee arg1) {
		int varstaComp=arg1.varsta;
		return varstaComp=this.varsta;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getVarsta() {
		return varsta;
	}



	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}



	public boolean isParking() {
		return parking;
	}



	public void setParking(boolean parking) {
		this.parking = parking;
	}



	public String getRol() {
		return rol;
	}



	public void setRol(String rol) {
		this.rol = rol;
	}
	
		
	
	
	
	

}
