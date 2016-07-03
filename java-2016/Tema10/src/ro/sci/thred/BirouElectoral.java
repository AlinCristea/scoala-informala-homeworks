package ro.sci.thred;

/**
 * This class manages the electoral votes
 * 
 *   @author alin
 *   This class contend two arraylist  witch contend voter list and invalid votes
 */

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.ViewportUI;

public class BirouElectoral {
	ArrayList<Voter> voterList = new ArrayList<>();
	ArrayList<Voter> invalidvotList = new ArrayList<>();

	Voter a = new Voter("cnp", "nume", "primar");

	/**
	 * This method add the object in voterList
	 * 
	 * @param a
	 */
	public void addAlegator(Voter a) {
		voterList.add(a);

	}

	/**
	 * This method remove the object from voterList
	 * 
	 * @param a
	 */

	public void removAlegator(Voter a) {
		voterList.remove(a);
	}

	public ArrayList<Voter> getList() {
		return voterList;
	}

	public void invalidVotes() {

		for (int i = 0; i <= voterList.size() - 1; i++) {
			for (int k = i + 1; k <= voterList.size() - 1; k++) {
				if (voterList.get(i).getPrimar().equals(", ")
						|| voterList.get(i).getCnp().equals(voterList.get(k).getCnp())) {
					invalidvotList.add(voterList.get(i));
				}
			}
		}

	}

	/**
	 * This method return number the votes for mayors
	 * 
	 */

	public void deliteInvalidVotes() {

		for (Voter invalidVoter : invalidvotList) {
			Iterator<Voter> iteratorListaValida = (Iterator) voterList.iterator();

			while (iteratorListaValida.hasNext()) {
				Voter current = iteratorListaValida.next();

				if (invalidVoter.getCnp().equals(current.getCnp())) {
					iteratorListaValida.remove();
				}
			}

		}

	}

	public int getVotMayer(String name) {
		int voturi = 0;

		for (int i = 0; i <= voterList.size() - 1; i++) {

			if ((voterList.get(i).getPrimar().equals(name))) {

				voturi++;
			}

		}
		return voturi;
	}

	public void displayVotes() {
		System.out.println("Voturi Boc: " + getVotMayer("Boc"));
		System.out.println("Voturi Alexa: " + getVotMayer("Alexa"));
		System.out.println("Voturi Buzoianu: " + getVotMayer("Buzoianu"));

	}

	/**
	 * This method display the voter list Every voter contend cnp, name
	 * ,namePrimar
	 */

	public void list() {
		for (int i = 0; i < voterList.size(); i++) {

			System.out.println("Alegator cu cnp" + voterList.get(i));
		}
	}

	/**
	 * This method display the invalid votes
	 */
	public void invalidList() {
		for (int i = 0; i < invalidvotList.size(); i++) {

			System.out.println("Alegator cu cnp" + invalidvotList.get(i));
		}

	}

	/**
	 * This method returns the total number of votes
	 * 
	 */
	public int returnTotalVot() {
		int invalidVotes = invalidvotList.size();
		int totalVot = getVotMayer("Boc") + getVotMayer("Alexa") + getVotMayer("Buzoianu");
		return totalVot;

	}

	public long getProcentBoc() {
		long procentBoc = (100 * getVotMayer("Boc")) / returnTotalVot();
		return procentBoc;
	}

	public long getProcentAlexa() {
		long procentAlexa = (100 * getVotMayer("Alexa")) / returnTotalVot();
		return procentAlexa;
	}

	public long getProcentBuzoianu() {
		long procentBuzoianu = (100 * getVotMayer("Buzoianu")) / returnTotalVot();
		return procentBuzoianu;
	}
/**
 * This method display the mayer and the percentage of the votes he got 
 */
	public void validationMayor() {
		if ((getVotMayer("Boc") > getVotMayer("Alexa")) && (getVotMayer("Boc") > getVotMayer("Buzoianu"))) {
			System.out.println("Boc este primar si a obtinut  :" + getProcentBoc() + "%  din voturi");
		} else if ((getVotMayer("Boc") < getVotMayer("Alexa")) && (getVotMayer("Alexa") > getVotMayer("Buzoianu"))) {
			System.out.println("Alexa este primar si  aobtinut :" + getProcentAlexa() + "%  din voturi");

		} else if ((getVotMayer("Boc") < getVotMayer("Buzoianu")) && (getVotMayer("Alexa") < getVotMayer("Buzoianu"))) {
			System.out.println("Buzoianu este primar si  aobtinut :" + getProcentBuzoianu() + "%  din voturi");
		}
	}

}