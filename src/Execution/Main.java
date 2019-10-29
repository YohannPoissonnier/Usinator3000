package Execution;

import Thread.*;
import Usine.*;
import Surveillance.*;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		ListeGobelins liste = new ListeGobelins(); //Crée la liste des gobelins, une ressource synchronisé
		
        System.out.println("<<<<<<<<<<<<<<<<<< L'USINE À GOBELIN >>>>>>>>>>>>>>>>>>");
        
        for(int i=0;i<100;i++) {
	        liste.genere();
	        liste.evalue();
	        liste.afficheEtatZones();
        }
	}

}
