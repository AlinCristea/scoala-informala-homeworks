package ro.sci.thred;

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

	public String getMayor() {
		return mayorName;
	}

	public void setMayor(String mayorName) {
		this.mayorName = mayorName;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return " " + cnp + "," + name + "," + mayorName;
	}

}
