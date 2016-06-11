package ro.sci.tema8;

public class Main {
	public static void main(String args[]) throws CategoryTicketsSoldoutException {

		Ticket t = new Ticket(100, 90);
		while (!t.IsFinished()) {
			try {
				t.vindereBilete();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());

			}
		}
            
		t.venituriPeCategorie();

		t.printTicketAvailability();
		

	}
}
