package usine;

public enum Zone {
	USINE("Usine"),
	TEST ("Test"),
	ANTRE ("Antre"),
	FOSSE ("Fosse");

	private String nom = "";
	
	//Constructeur
	Zone(String name){
	    this.nom = name;
	}
	   
	public String toString(){
		return nom;
	}
}
