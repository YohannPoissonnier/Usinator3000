package Strategie;

import Usine.Gobelin;
import Usine.Statut;

public class ZoneAntreStrategie implements GobelinStrategie {
	public ZoneAntreStrategie() {
		
	}
	public void modifierEtatGobelin(Gobelin gobelin) {
		gobelin.setStatut(Statut.APPROUVE);
	}
}
