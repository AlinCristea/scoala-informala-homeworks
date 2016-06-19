package ro.sci.tema9;

public class Alegator {
	String cnp;
	String nume;
	String numePrimar;

	public Alegator(String cnp, String nume, String numePrimar) {
		this.cnp = cnp;
		this.nume = nume;
		this.numePrimar = numePrimar;

	}

	public String getPrimar() {
		return numePrimar;
	}

	public void setPrimar(String numePrimar) {
		this.numePrimar = numePrimar;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	public String toString(){
		return  " "+cnp+","+nume+","+numePrimar;
	}

}
