package Thread;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

import surveillance.*;
import usine.Gobelin;
import usine.Zone;

public class ListeGobelins {
	private CopyOnWriteArrayList<Gobelin> gobelins = new CopyOnWriteArrayList<>();	//ArrayList assurant une intégrité des données lors de la synchro
	private Gobelin gobelin = null;
	private String genererGobelinType;

	public CopyOnWriteArrayList<Gobelin> getGobelins() {
		return gobelins;
	}

	public void setGobelins(CopyOnWriteArrayList<Gobelin> gobelins) {
		this.gobelins = gobelins;
	}

	//initialisation des alarmes
	public ListeGobelins() {
	}
	
	//Génère les gobelins de façon aléatoire selon le pattern factory
	public void genere(){
		gobelin = new Gobelin();
		gobelins.add(gobelin);
		if(gobelin != null) {
			System.out.println("---------------- Création d'un nouveau gobelin ----------------");
			gobelin.afficheInfos();
			System.out.println("---------------------------------------------------------------");
		//	notifyAll();
		}
	}
	//Évalue les gobelin selon le pattern strategy
	public void evalue() {
		System.out.println("Évalue les gobelins");
	}
	//affiche les zones
	public void afficheEtatZones() {		
		if(gobelins.stream().count() == Long.valueOf(0)) {
			//Thread en attente
		}
		else {
			System.out.println("----------------------- STATISTIQUES -----------------------------");
			System.out.println("Gobelin dans la zone USINE: " + gobelins.stream().filter(x -> (x.getZone() == Zone.USINE)).filter(i -> i != null).count());
			System.out.println("Gobelin dans la zone TEST : " + gobelins.stream().filter(x -> (x.getZone() == Zone.TEST)).filter(i -> i != null).count());
			System.out.println("Gobelin dans la zone ANTRE: " + gobelins.stream().filter(x -> (x.getZone() == Zone.ANTRE)).filter(i -> i != null).count());
			System.out.println("Gobelin dans la zone FOSSE: " + gobelins.stream().filter(x -> (x.getZone() == Zone.FOSSE)).filter(i -> i != null).count());
			System.out.println("                     TOTAL: " + gobelins.stream().count());
			System.out.println("----------------------------------- -----------------------------");
		}
	}


}
