package Strategie;

import Usine.Gobelin;
import Usine.Zone;

public class ZoneUsineStrategie implements GobelinStrategie {
	public ZoneUsineStrategie() {
		
	}
	public void modifierEtatGobelin(Gobelin gobelin) {
		if(gobelin.getZone() == Zone.USINE) {
			gobelin.setZone(Zone.TEST);
			gobelin.degatDeplacement(2);
		}
	}
}
