package Strategie;

import Usine.Gobelin;
import Usine.Statut;

public class ZoneFosseStrategie implements GobelinStrategie {
	public ZoneFosseStrategie() {
		
	}
	public void modifierEtatGobelin(Gobelin gobelin) {
		gobelin.setStatut(Statut.REFUSE);
	}
}
