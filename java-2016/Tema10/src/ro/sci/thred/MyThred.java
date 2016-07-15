package ro.sci.thred;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MyThred {
	ManageVotes mgv = new ManageVotes();

	public MyThred(ManageVotes bir) {
		this.mgv = bir;
	}

	public void startThred(ArrayList<Voter> voterList) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (mgv) {
					System.out.println();
					for (Voter votes : voterList) {
						try {
							Thread.sleep((long) (2000));

						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						mgv.addVoter(votes);

						// System.out.println(votes.toString());

					}

				}
			}

		});
		// Thread t2 = new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// Timer t = new Timer();
		// t.scheduleAtFixedRate(new TimerTask() {
		//
		// @Override
		// public void run() {
		//
		// bir.invalidVotes();
		// bir.deliteInvalidVotes();
		// System.out.println("............");
		// bir.list();
		//
		// bir.validationMayor();
		//
		// System.out.println("total voturi " + bir.returnTotalVot());
		//
		// }
		// }, 0, 5000);
		//
		// }
		//
		// });
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(5000l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					mgv.invalidVotes();
					mgv.deliteInvalidVotes();
					System.out.println("............");
					mgv.list();

					mgv.validationMayor();

					System.out.println("total votes " + mgv.returnTotalVot());

				}
			}

		});
		t1.start();
		t2.start();

	}

}