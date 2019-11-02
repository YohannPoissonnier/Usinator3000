package Surveillance;

import Usine.Gobelin;
import Usine.Statut;
import Usine.Zone;

public class Obsrv_GobelinPvs implements Obsrv_Gobelin{
	public Obsrv_GobelinPvs() {
		
	}
	public void alarme(Gobelin gobelin) {	
		if(gobelin.getPvs() == 0 && gobelin.getZone() != Zone.FOSSE ) {
			gobelin.setStatut(Statut.REFUSE);
			gobelin.setZone(Zone.FOSSE);
			System.out.println("Le gobelin " + gobelin.getId()+" est " + gobelin.getStatut() + " et est envoyé dans la fosse.");	}
	}
}
