package ro.sci.tema9;
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

public class ManageVotes {
	ArrayList<Voter> voterList = new ArrayList<>();
	ArrayList<Voter> invalidvotList = new ArrayList<>();

	Voter a = new Voter("cnp", "name", "mayor");

	/**
	 * This method add the object in voterList
	 * 
	 * @param a
	 */
	public void addVoter(Voter a) {
		voterList.add(a);

	}

	/**
	 * This method remove the object from voterList
	 * 
	 * @param a
	 */

	public void removVoter(Voter a) {
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
		System.out.println("Votes Boc: " + getVotMayer("Boc"));
		System.out.println("Votes Alexa: " + getVotMayer("Alexa"));
		System.out.println("Votes Buzoianu: " + getVotMayer("Buzoianu"));

	}

	/**
	 * This method display the voter list Every voter contend cnp, name
	 * ,namePrimar
	 */

	public void list() {
		for (int i = 0; i < voterList.size(); i++) {

			System.out.println("Elector cnp" + voterList.get(i));
		}
	}

	/**
	 * This method display the invalid votes
	 */
	public void invalidList() {
		for (int i = 0; i < invalidvotList.size(); i++) {

			System.out.println("Elector cnp" + invalidvotList.get(i));
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
	 * 
	 * @return
	 */
	public String validationMayor(String mesage) {

		if ((getVotMayer("Boc") > getVotMayer("Alexa")) && (getVotMayer("Boc") > getVotMayer("Buzoianu"))) {
			mesage = "Boc is mayor and get  :" + getProcentBoc() + "% from total votes";
			//System.out.println("Boc is mayor and get  :" + getProcentBoc() + "% from total votes");

		} else if ((getVotMayer("Boc") < getVotMayer("Alexa")) && (getVotMayer("Alexa") > getVotMayer("Buzoianu"))) {
			mesage = "Alexa is mayor and get:" + getProcentAlexa() + "%  from total votes";
			//System.out.println("Alexa is mayor and get:" + getProcentAlexa() + "%  from total votes");

		} else if ((getVotMayer("Boc") < getVotMayer("Buzoianu")) && (getVotMayer("Alexa") < getVotMayer("Buzoianu"))) {
			mesage = "Buzoianu is mayor and get :" + getProcentBuzoianu() + "%  from total votes";
			//System.out.println("Buzoianu is mayor and get :" + getProcentBuzoianu() + "%  from total votes");
		}

		return mesage;

	}

}