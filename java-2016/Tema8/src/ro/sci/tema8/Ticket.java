package ro.sci.tema8;
/**
 * This class contains a HashMap containing three categories of tickets
*@author alin 
 */

import java.util.HashMap;
import java.util.Map;

public class Ticket {
	/**
	 * parameters:nrTicket=number of tickets to be sold parameters:nrClient=the
	 * number of customers who buy tickets parameters:nrBilete=the number of
	 * tickets sold
	 */
	private int nrTicket;
	private int nrClient;
	private int nrBilete;
	private int contorBileteVandute = 0;
	private int profitCategoria3;

	public int getContorBileteVandute() {
		return contorBileteVandute;
	}

	public int getNrBilete() {
		return nrBilete;
	}

	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}

	public void setContorBileteVandute(int contorBileteVandute) {
		this.contorBileteVandute = contorBileteVandute;
	}

	private boolean finished;

	public boolean IsFinished() {
		return finished;
	}

	Map<String, Integer> ticket = new HashMap<String, Integer>();

	/**
	 * 
	 * @param nrTicket
	 * @param nrBilete
	 */
	public Ticket(int nrTicket, int nrBilete) {
		this.nrTicket = nrTicket;

		this.nrBilete = nrBilete;

		nrClient = 0;

		ticket.put("categoria 1", nrTicket * 50 / 100);
		ticket.put("categoria 2", nrTicket * 35 / 100);
		ticket.put("categoria 3", nrTicket * 15 / 100);
	}

	public int getNrTicket() {
		return nrTicket;
	}

	public void setNrTicket(int nrTiket) {
		this.nrTicket = nrTicket;
	}

	public int getNrClient() {
		return nrClient;
	}

	public void setNrClient(int nrClient) {
		this.nrClient = nrClient;
	}

	/**
	 * This method returns the number of tickets sold for each category, cherish
	 * each ticket category and amount of revenues by category and total value
	 * of tickets sold
	 */
	public void venituriPeCategorie() {
		Integer soldCategorie1 = (nrTicket - (nrTicket * 50 / 100)) - ticket.get("categoria 1");
		Integer soldCategorie2 = (nrTicket - (nrTicket * 65 / 100)) - ticket.get("categoria 2");
		Integer soldCategorie3 = (nrTicket - (nrTicket * 85 / 100)) - ticket.get("categoria 3");

		profitCategoria3 = soldCategorie3 * 120;

		System.out.println("nr bilete vandute categoria 1 : " + soldCategorie1 + " .Price/ticket: " + 50
				+ " .Valoarea biletelor vandute " + (soldCategorie1 * 50));
		System.out.println("nr bilete vandute categoria 2 : " + soldCategorie2 + " .Price/ticket: " + 80
				+ " .Valoarea biletelor vandute " + (soldCategorie2 * 80));
		System.out.println("nr bilete vandute categoria 3 : " + soldCategorie3 + " .Price/ticket: " + 120
				+ " .Valoarea biletelor vandute " + (soldCategorie3 * 120));
		System.out.println("Valoarea Totalaa biletelor vandute :"
				+ ((soldCategorie1 * 50) + (soldCategorie2 * 80) + (soldCategorie3 * 120)));
		
		
	}

	/**
	 * This method sell tickets starting with Category 1 contains 50% of total
	 * ticket when tickets from Category 1 ended throw ""an exception and go to
	 * category 2 , which contains 35% of all ticket when tickets ends sheds
	 * exception and move to category 3 containing 15% of total ticket when it
	 * ends the category 3 tickets sold and throw an exception
	 * "Toate biletele au fost vandute "
	 * 
	 * @throws CategoryTicketsSoldoutException
	 * @throws SoldoutException=
	 */

	public void vindereBilete() throws CategoryTicketsSoldoutException, SoldoutException {
		while (contorBileteVandute < nrBilete) {
			nrClient++;

			if ((contorBileteVandute < nrTicket * 50 / 100)) {

				int bileteDisponibile = ticket.get("categoria 1");
				if (nrClient % 17 == 0) {
					ticket.put("categoria 1", bileteDisponibile - 3);
					contorBileteVandute += 3;
				} else {
					ticket.put("categoria 1", bileteDisponibile - 1);
					contorBileteVandute += 1;
				}

				int bileteRamase = ticket.get("categoria 1");
				if (bileteRamase == 0) {
					try {
						throw new CategoryTicketsSoldoutException("Nu mai sunt bilete la categoria  1");
					} catch (Exception e) {
						throw e;
						// continue;
					}
				}

				continue;
			}

			if ((contorBileteVandute < nrTicket * 85 / 100) && (contorBileteVandute >= nrTicket * 50 / 100)) {

				int bileteDisponibile = ticket.get("categoria 2");
				if (nrClient % 17 == 0) {
					ticket.put("categoria 2", bileteDisponibile - 3);
					contorBileteVandute += 3;
				} else {
					ticket.put("categoria 2", bileteDisponibile - 1);
					contorBileteVandute += 1;
				}

				int bileteRamase = ticket.get("categoria 2");
				if (bileteRamase == 0)
					try {
						throw new CategoryTicketsSoldoutException("Nu mai sunt bilete la categoria  2");
					} catch (Exception e) {
						throw e;
						// continue;
					}
				continue;
			}

			if ((contorBileteVandute >= nrTicket * 85 / 100)) {

				int bileteDisponibile = ticket.get("categoria 3");
				if (nrClient % 17 == 0) {
					ticket.put("categoria 3", bileteDisponibile - 3);
					contorBileteVandute += 3;
				} else {
					ticket.put("categoria 3", bileteDisponibile - 1);
					contorBileteVandute += 1;
				}

				int bileteRamase = ticket.get("categoria 3");
				if (bileteRamase == 0)
					try {
						throw new CategoryTicketsSoldoutException("Nu mai sunt bilete la categoria 3");
					} catch (Exception e) {
						// continue;
						throw e;
					}
				continue;
			}
		}

		finished = true;

		if (ticket.get("categoria 1") == 0 && ticket.get("categoria 2") == 0 && ticket.get("categoria 3") == 0)
			throw new SoldoutException("Toate bilete au fost vandude.");

	}

	/**
	 * This method returns the number of tickets available in each category
	 */

	public void printTicketAvailability() {
		System.out.println();
		for (Map.Entry<String, Integer> ticketInfo : ticket.entrySet()) {
			String value = ticketInfo.getKey();
			int key = ticketInfo.getValue();
			System.out.println("Ticket category: " + value + ", Available: " + key);
		}

	}

}
