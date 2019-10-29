package Usine;

public class GobelinDemineur extends Gobelin{
	public GobelinDemineur(int defenseMin, int defenseMax, int pvsMin, int pvsMax, String type) {
		super();
		this.setDefenseMin(defenseMin);
		this.setDefenseMax(defenseMax);
		this.setPvsMin(pvsMin);
		this.setPvsMax(pvsMax);
		this.generateurDefense();
		this.generateurPvs();
		this.setType(type);
	}
}
