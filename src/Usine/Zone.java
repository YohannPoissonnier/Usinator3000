package Usine;

public enum Zone {
	USINE("Usine"),
	TEST ("Test"),
	ANTRE ("Antre"),
	FOSSE ("Fosse");

	private String nom = "";
	
	Zone(String name){
	    this.nom = name;
	}
	   
	public String toString(){
		return nom;
	}
}
