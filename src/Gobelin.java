package usine;


//TODO transformer cette classe selon l'énoncé du TP3
public class Gobelin {
	private int id = 1;
	private static int idCompteur = 0;
	private String type;
	private int pvs;
	private int pvsMin;
	private int pvsMax;
	private int defense;
	private int defenseMin;
	private int defenseMax;		
	private Statut statut; //Non approuvé, Approuvé, Refusé
	private Zone zone;//Usine, Test, Antre (pour conservation), Fosse (pour destruction)
	
	public Gobelin() {
		idCompteur++;
		setId(idCompteur);	
		setStatut(Statut.NON_APPROUVE);
		setZone(Zone.USINE);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getIdCompteur() {
		return idCompteur;
	}
	public static void setIdCompteur(int idCompteur) {
		Gobelin.idCompteur = idCompteur;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPvs() {
		return pvs;
	}
	public void setPvs(int pvs) {
		this.pvs = pvs;
	}
	public int getPvsMin() {
		return pvsMin;
	}
	public void setPvsMin(int pvsMin) {
		this.pvsMin = pvsMin;
	}
	public int getPvsMax() {
		return pvsMax;
	}
	public void setPvsMax(int pvsMax) {
		this.pvsMax = pvsMax;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getDefenseMin() {
		return defenseMin;
	}
	public void setDefenseMin(int defenseMin) {
		this.defenseMin = defenseMin;
	}
	public int getDefenseMax() {
		return defenseMax;
	}
	public void setDefenseMax(int defenseMax) {
		this.defenseMax = defenseMax;
	}
	public Statut getStatut() {
		return statut;
	}
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	
	public void generateurDefense() {
		this.defense = (int)(Math.random() * (this.defenseMax - this.defenseMin)) + this.defenseMin;
	}
	public void generateurPvs() {
		this.pvs = (int)(Math.random() * (this.pvsMax - this.pvsMin)) + this.pvsMin;
	}
	public void afficheInfos() {
        System.out.println("Id: " + this.getId()); 
        System.out.println("Type: " + this.getType()); 
        System.out.println("Pvs: " + this.getPvs()); 
        System.out.println("Défense: " + this.getDefense());
        System.out.println("Statut: " + this.getStatut()); 
        System.out.println("Zone: " + this.getZone()); 
        System.out.println(""); 
	}
	public void degatDeplacement(int degat) {
		this.pvs-=degat;
        System.out.println("Le gobelin " + this.getId()+ " reçoit "+ degat + " points de dégât lors de son déplacement.");
        if(this.pvs<0) this.pvs=0;
        System.out.println("   Il a maintenant " + this.pvs + " pvs."); 
	}
	
}
