package Usine;

public class GobelinCombattant extends Gobelin implements Combattant{
	public GobelinCombattant(int defenseMin, int defenseMax, int pvsMin, int pvsMax, String type) {
		super();
		setDefenseMin(defenseMin);
		setDefenseMax(defenseMax);
		setPvsMin(pvsMin);
		setPvsMax(pvsMax);
		setType(type);
	}
	public void attaque() {
		System.out.println("Attaque avec une épée");
	}
	
}
