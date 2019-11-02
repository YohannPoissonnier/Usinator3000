package Thread;

public class ThrGenere extends Thread{
	private int delai;
	private int nombre;
	private ListeGobelins liste;
	
	public ThrGenere(ListeGobelins liste, int delai, int nombre) {
		this.delai = delai;
		this.liste = liste;
		this.nombre = nombre;
	}
	public void run() {
		try {
			while(nombre > 0) {
				nombre--;
				liste.genere();
				sleep(delai);
			}
			return;
		} catch(InterruptedException e) {}
	}
}