package Strategie;

import Usine.Gobelin;
import Usine.Statut;
import Usine.Zone;

public class ZoneFosseStrategie implements GobelinStrategie {
	public ZoneFosseStrategie() {
		
	}
	public void modifierEtatGobelin(Gobelin gobelin) {
		if(gobelin.getZone() == Zone.FOSSE) {
			gobelin.setStatut(Statut.REFUSE);
		}
	}
}
