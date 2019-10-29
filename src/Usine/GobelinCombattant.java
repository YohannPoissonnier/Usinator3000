package Usine;

public class GobelinCombattant extends Gobelin implements Combattant{
	
	public GobelinCombattant(int defenseMin, int defenseMax, int pvsMin, int pvsMax, String type) {
		super();
		this.setDefenseMin(defenseMin);
		this.setDefenseMax(defenseMax);
		this.setPvsMin(pvsMin);
		this.setPvsMax(pvsMax);
		this.generateurDefense();
		this.generateurPvs();
		this.setType(type);
	}
	public void attaque() {
		System.out.println("Attaque avec une épée");
	}
	
}
