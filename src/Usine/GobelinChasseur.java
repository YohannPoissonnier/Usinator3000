package Usine;

public class GobelinChasseur extends Gobelin implements Combattant{
	public GobelinChasseur(int defenseMin, int defenseMax, int pvsMin, int pvsMax, String type) {
		super();
		setDefenseMin(defenseMin);
		setDefenseMax(defenseMax);
		setPvsMin(pvsMin);
		setPvsMax(pvsMax);
		setType(type);
	}
	public void attaque() {
		System.out.println("Attaque avec un arc");
	}
}
