package Thread;

import Usine.Zone;

public class ThrEvalue extends Thread{
	private int delai;
	private ListeGobelins liste;
	
	public ThrEvalue(ListeGobelins liste, int delai) {
		this.delai = delai;
		this.liste = liste;
	}
	public void run() {
		try {
			liste.evalue();
			sleep(delai);
		} catch(InterruptedException e) {}
		if(liste.getGobelins().isEmpty()) {
			
		}
	}
	
}
