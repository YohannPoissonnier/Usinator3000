package Execution;

import Thread.*;



public class Main {

	public static void main(String[] args) {
		ListeGobelins liste = new ListeGobelins(); //Crée la liste des gobelins, une ressource synchronisé
		ThrGenere l1 = new ThrGenere(liste, 10, 100);
		ThrEvalue l2 = new ThrEvalue(liste, 150);
		ThrAffiche l3 = new ThrAffiche(liste, 50);
        System.out.println("<<<<<<<<<<<<<<<<<< L'USINE À GOBELIN >>>>>>>>>>>>>>>>>>");
       
        l1.start();
        l2.start();
        l3.setDaemon(true);
        l3.start();
      //TODO Premier pas, mais il va falloir transformer tout ça en jolies threads
       /* for(int i=0;i<100;i++) {
	        liste.genere();
	        liste.evalue();
	        liste.afficheEtatZones();
        }*/
	}

}