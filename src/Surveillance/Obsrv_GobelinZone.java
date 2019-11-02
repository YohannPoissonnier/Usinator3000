package Surveillance;

import Strategie.*;
import Usine.Gobelin;

public class Obsrv_GobelinZone implements Obsrv_Gobelin{
	public Obsrv_GobelinZone() {
		
	}
	public void alarme(Gobelin gobelin) {	
		switch(gobelin.getZone()) {
		case USINE: gobelin.modifierEtatGobelin(new ZoneUsineStrategie());break;
		case TEST:  gobelin.modifierEtatGobelin(new ZoneTestStrategie());break;
		case ANTRE: gobelin.modifierEtatGobelin(new ZoneAntreStrategie());break;
		case FOSSE: gobelin.modifierEtatGobelin(new ZoneFosseStrategie());break;
		default:
			break; 
		}
	}
}
