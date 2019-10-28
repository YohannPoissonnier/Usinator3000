package Usine;

public enum Statut {
	NON_APPROUVE("Non approuvé"),
	APPROUVE ("Approuvé"),
	REFUSE ("Refusé");
	
	private String nom = "";
	
	//Constructeur
	Statut(String name){
	    this.nom = name;
	}
	   
	public String toString(){
		return nom;
	}
}
