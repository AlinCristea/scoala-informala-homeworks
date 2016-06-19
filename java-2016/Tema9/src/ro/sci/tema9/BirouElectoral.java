package ro.sci.tema9;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.plaf.ViewportUI;

public class BirouElectoral {
	ArrayList<Alegator> alegatorList = new ArrayList<>();

	Alegator a = new Alegator("cnp", "nume", "primar");

	public void addAlegator(Alegator a) {
		alegatorList.add(a);

	}

	public void removAlegator(Alegator a) {
		alegatorList.remove(a);
	}

	public int voturiInvalide() {
		int votInvalid = 0;

		for (int i = 0; i <= alegatorList.size(); i++) {
			for (int k = i + 1; k <= alegatorList.size(); k++) {
				if (alegatorList.get(i).getCnp().equals(alegatorList.get(k).getCnp())) {
					alegatorList.remove(i);
					// alegatorList.remove(k);
					votInvalid++;
				}

			}

		}
		return votInvalid;
	}

	public int getVotInvalidPrimar() {
		int votInvPrimar = 0;
		for (int i = 0; i <= alegatorList.size(); i++) {

			if (alegatorList.get(i).getPrimar().equals(", ")) {
				votInvPrimar++;
			}
		}
		return votInvPrimar;

	}

	public int getVotBoc() {
		int votBoc = 0;

		for (int i = 0; i <= alegatorList.size() - 1; i++) {

			if (alegatorList.get(i).getPrimar().equals("Boc")) {
				votBoc++;

			}
		}
		return votBoc;

	}

	public int getVotAlexa() {
		int votAlexa = 0;

		for (int i = 0; i <= alegatorList.size() - 1; i++) {

			if (alegatorList.get(i).getPrimar().equals("Alexa")) {
				votAlexa++;

			}
		}
		return votAlexa;

	}

	public int getVotBuzoianu() {
		int votBuzoianu = 0;

		for (int i = 0; i <= alegatorList.size() - 1; i++) {

			if (alegatorList.get(i).getPrimar().equals("Buzoianu")) {
				votBuzoianu++;

			}
		}
		return votBuzoianu;

	}

	public void list() {
		for (int i = 0; i < alegatorList.size(); i++) {

			System.out.println("Alegator cu cnp" + alegatorList.get(i));
		}

	}

	public int returnTotalVot() {
		int totalVot = getVotBoc() + getVotAlexa() + getVotBuzoianu();
		return totalVot;

	}

	public long getProcentBoc() {
		long procentBoc = (100 * getVotBoc()) / returnTotalVot();
		return procentBoc;
	}

	public long getProcentAlexa() {
		long procentAlexa = (100 * getVotAlexa()) / returnTotalVot();
		return procentAlexa;
	}

	public long getProcentBuzoianu() {
		long procentBuzoianu = (100 * getVotBuzoianu()) / returnTotalVot();
		return procentBuzoianu;
	}

	public void validarePrimar(){
		if ((getVotBoc()>getVotAlexa())&&(getVotBoc()>getVotBuzoianu())){
			System.out.println("Boc este primar si a obtinut  :"+getProcentBoc()+ "din voturi");
		} else if ((getVotBoc()<getVotAlexa())&&(getVotAlexa()>getVotBuzoianu())){
			System.out.println("Alexa este primar si  aobtinut :"+getProcentAlexa()+"din voturi");
			
		}else if((getVotBoc()<getVotBuzoianu())&&(getVotAlexa()<getVotBuzoianu())){
			System.out.println("Buzoianu este primar si  aobtinut :"+getProcentBuzoianu()+"din voturi");
		}
	}

}