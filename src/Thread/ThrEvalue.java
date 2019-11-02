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
		long plop;
		try {
			while(!interrupted()) {
				
				
				plop = liste.getGobelins().stream().filter(x -> (x.getZone() == Zone.USINE || x.getZone() == Zone.TEST)).filter(i -> i != null).count();
				plop = liste.getGobelins().stream().filter(x -> (x.getZone() == Zone.USINE || x.getZone() == Zone.TEST)).filter(i -> i != null).count();
				if(plop == Long.valueOf(0))
				{
					return;
				}
				else {
					liste.evalue();
					sleep(delai);
				}
			}
		} catch(InterruptedException e) {}
	}
}
