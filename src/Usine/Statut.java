package Usine;

public enum Statut {
	NON_APPROUVE("Non approuv�"),
	APPROUVE ("Approuv�"),
	REFUSE ("Refus�");
	
	private String nom = "";
	
	//Constructeur
	Statut(String name){
	    this.nom = name;
	}
	   
	public String toString(){
		return nom;
	}
}
