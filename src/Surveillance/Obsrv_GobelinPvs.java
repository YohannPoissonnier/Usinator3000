package Surveillance;

import Usine.Gobelin;
import Usine.Statut;
import Usine.Zone;

public class Obsrv_GobelinPvs {
	public Obsrv_GobelinPvs() {
		
	}
	public void alarme(Gobelin f) {	
		if(f.getPvs() == 0 && f.getZone() != Zone.FOSSE ) {
			f.setStatut(Statut.REFUSE);
			System.out.println("Le gobelin " + f.getId()+" est " + f.getStatut() + " et est envoyé dans la fosse.");	}
	}
}
