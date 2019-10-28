package Usine;

import java.util.Random;

public class GobelinMusicien extends Gobelin{

	public GobelinMusicien(int defenseMin, int defenseMax, int pvsMin, int pvsMax, String type) {
		super();
		Random rand = new Random();
		setDefense(rand.nextInt(defenseMax - defenseMin) + defenseMin);
		setPvs(rand.nextInt(pvsMax - pvsMin) + pvsMin);
		setType(type);
	}
	
}
