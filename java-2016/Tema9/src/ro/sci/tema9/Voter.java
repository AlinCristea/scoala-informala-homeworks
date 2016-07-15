package ro.sci.tema9;

/**
 * This is Voter class and in this class we create the voter who has cnp ,name
 * ,mayorName
 * 
 * @author alin
 *
 */

public class Voter {
	String cnp;
	String name;
	String mayorName;

	public Voter(String cnp, String name, String mayorName) {
		this.cnp = cnp;
		this.name = name;
		this.mayorName = mayorName;

	}

	public String getPrimar() {
		return mayorName;
	}

	public void setPrimar(String mayorName) {
		this.mayorName = mayorName;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public String getNume() {
		return name;
	}

	public void setNume(String name) {
		this.name = name;
	}

	public String toString() {
		return " " + cnp + "," + name + "," + mayorName;
	}

}
