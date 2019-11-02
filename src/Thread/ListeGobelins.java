package Thread;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

import Surveillance.*;
import Usine.*;

public class ListeGobelins {
	private CopyOnWriteArrayList<Gobelin> gobelins = new CopyOnWriteArrayList<>();	//ArrayList assurant une intégrité des données lors de la synchro
	private Gobelin gobelin = null;
	private String genererGobelinType;
	private UsineGobelin usine = new UsineGobelin();
	public SurveillanceGobelin surveillance = new SurveillanceGobelin();
	
	public CopyOnWriteArrayList<Gobelin> getGobelins() {
		return gobelins;
	}

	public void setGobelins(CopyOnWriteArrayList<Gobelin> gobelins) {
		this.gobelins = gobelins;
	}
	
	//initialisation des alarmes
	public ListeGobelins() {
		surveillance.connecterObservateur(new Obsrv_GobelinZone());
		surveillance.connecterObservateur(new Obsrv_GobelinPvs());
	}
	
	//Génère les gobelins de façon aléatoire selon le pattern factory
	public synchronized void genere(){
				
		switch ((int)(Math.random() * (5-0)) + 0) {
		case 0: genererGobelinType = "combattant";
				break;
		case 1: genererGobelinType = "explorateur";
				break;
		case 2: genererGobelinType = "demineur";
				break;
		case 3: genererGobelinType = "chasseur";
				break;
		case 4: genererGobelinType = "musicien";
				break;
		}
		gobelin = usine.getGobelin(genererGobelinType);
		gobelins.add(gobelin);
		
		if(gobelin != null) {
			System.out.println("---------------- Création d'un nouveau gobelin ----------------");
			gobelin.afficheInfos();
			System.out.println("---------------------------------------------------------------");
			notifyAll();
		}
	}
	//Évalue les gobelin selon le pattern strategy
	public synchronized void evalue() {
		System.out.println("Évalue les gobelins");
		surveillance.sonnerAlarme(gobelin);	
		if(gobelins.stream().count() == Long.valueOf(0)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			surveillance.sonnerAlarme(gobelin);
		}
	}
	//affiche les zones
	public synchronized  void afficheEtatZones() {		
		if(gobelins.stream().count() == Long.valueOf(0)) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
