package Thread;

public class ThrAffiche extends Thread{
	private int delai;
	private ListeGobelins liste;
	
	public ThrAffiche(ListeGobelins liste, int delai) {
		this.delai = delai;
		this.liste = liste;
;	}
	public void run() {
		try {
			while(!interrupted()) {
				liste.afficheEtatZones();
				sleep(delai);
			}
		} catch(InterruptedException e) {}
	}
}
