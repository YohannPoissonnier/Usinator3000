package Usine;

import java.util.Random;

public class GobelinChasseur extends Gobelin implements Combattant{
	public GobelinChasseur(int defenseMin, int defenseMax, int pvsMin, int pvsMax, String type) {
		super();
		Random rand = new Random();
		setDefense(rand.nextInt(defenseMax - defenseMin) + defenseMin);
		setPvs(rand.nextInt(pvsMax - pvsMin) + pvsMin);
		setType(type);
	}
	public void attaque() {
		System.out.println("Attaque avec un arc");
	}
}
