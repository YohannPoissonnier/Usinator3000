package Surveillance;

import Usine.Gobelin;

public class Obsrv_GobelinZone{
	public Obsrv_GobelinZone() {
		
	}
	public void alarme(Gobelin f) {	
		switch(f.getZone()) {
		case USINE: f.modifierEtatGobelin(null);break;
		case TEST: break;
		case ANTRE: break;
		case FOSSE: break;
		default:
			break; 
		}
	}
}
