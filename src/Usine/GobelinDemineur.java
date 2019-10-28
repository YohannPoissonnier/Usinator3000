package Usine;

public class GobelinDemineur extends Gobelin{
	public GobelinDemineur(int defenseMin, int defenseMax, int pvsMin, int pvsMax, String type) {
		super();
		setDefenseMin(defenseMin);
		setDefenseMax(defenseMax);
		setPvsMin(pvsMin);
		setPvsMax(pvsMax);
		setType(type);
	}
}
