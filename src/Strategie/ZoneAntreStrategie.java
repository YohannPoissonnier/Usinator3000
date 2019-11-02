package Strategie;

import Usine.Gobelin;
import Usine.Statut;
import Usine.Zone;

public class ZoneAntreStrategie implements GobelinStrategie {
	public ZoneAntreStrategie() {
		
	}
	public void modifierEtatGobelin(Gobelin gobelin) {
		if(gobelin.getZone() == Zone.ANTRE) {
			gobelin.setStatut(Statut.APPROUVE);
		}
	}
}
