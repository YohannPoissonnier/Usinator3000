package execution;

import thread.*;
import usine.*;
import surveillance.*;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		ListeGobelins liste = new ListeGobelins(); //Cr�e la liste des gobelins, une ressource synchronis�
		
        System.out.println("<<<<<<<<<<<<<<<<<< L'USINE � GOBELIN >>>>>>>>>>>>>>>>>>");
        
        //TODO Premier pas, mais il va falloir transformer tout �a en jolies threads
        for(int i=0;i<100;i++) {
	        liste.genere();
	        liste.evalue();
	        liste.afficheEtatZones();
        }
	}

}
