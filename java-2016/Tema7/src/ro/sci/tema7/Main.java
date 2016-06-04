package ro.sci.tema7;

public class Main {

	public static void main(String[] args) {
		Emploee e=new Emploee("alin", 3, false, "inginer");
		Emploee e1=new Emploee("dan", 4, true, "inginer");

		Emploee e2=new Emploee("calin", 2, false, "manager");

		Emploee e3=new Emploee("beni", 6, true, "inginer");

		Emploee e4=new Emploee("dorel", 8, true, "manager");

		Emploee e5=new Emploee("lore", 5, false, "inginer");

        Company c=new Company();
        c.addEmploee(e);
        c.addEmploee(e1);
        c.addEmploee(e2);
        c.addEmploee(e3);
        c.addEmploee(e4);
        c.addEmploee(e5);
        
        c.printList();
	}

}
