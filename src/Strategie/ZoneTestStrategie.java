package Strategie;

import Usine.Gobelin;
import Usine.Statut;
import Usine.Zone;

public class ZoneTestStrategie implements GobelinStrategie {
	public ZoneTestStrategie() {
		
	}
	public void modifierEtatGobelin(Gobelin gobelin) {
		if(gobelin.getZone() == Zone.TEST && gobelin.getPvs() > 5){
			gobelin.setStatut(Statut.APPROUVE);
			gobelin.setPvs(gobelin.getPvs() - 2);
		}
		else {
			gobelin.setStatut(Statut.REFUSE);
			gobelin.setPvs(gobelin.getPvs() - 5);
		}
	}
}
