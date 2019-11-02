package Surveillance;

import java.util.ArrayList;
import Usine.Gobelin;

public class SurveillanceGobelin {
	ArrayList<Obsrv_Gobelin> ecouteurs;

	public SurveillanceGobelin() {
		this.ecouteurs = new ArrayList<>();
	}
	public void connecterObservateur(Obsrv_Gobelin obsrv) {
		ecouteurs.add(obsrv);
	}
	public void sonnerAlarme(Gobelin gobelin) {
		ecouteurs.forEach(element->element.alarme(gobelin));
	}
}
