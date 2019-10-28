package Usine;

public class GobelinExplorateur extends Gobelin implements Combattant{
	public GobelinExplorateur(int defenseMin, int defenseMax, int pvsMin, int pvsMax, String type) {
		super();
		setDefenseMin(defenseMin);
		setDefenseMax(defenseMax);
		setPvsMin(pvsMin);
		setPvsMax(pvsMax);
		setType(type);
	}
	public void attaque() {
		System.out.println("Attaque avec une lance");
	}
}
