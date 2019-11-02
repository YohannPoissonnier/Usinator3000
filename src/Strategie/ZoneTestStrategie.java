package Strategie;

import Usine.Gobelin;
import Usine.Statut;
import Usine.Zone;

public class ZoneTestStrategie implements GobelinStrategie {
	public ZoneTestStrategie() {
		
	}
	public void modifierEtatGobelin(Gobelin gobelin) {
		if(gobelin.getZone() == Zone.TEST && gobelin.getPvs() > 5){
			gobelin.setZone(Zone.ANTRE);
			gobelin.degatDeplacement(2);
		}
		else{
			gobelin.setZone(Zone.FOSSE);
			gobelin.degatDeplacement(5);
		}
	}
}
