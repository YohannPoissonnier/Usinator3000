package Usine;

public class GobelinMusicien extends Gobelin{

	public GobelinMusicien(int defenseMin, int defenseMax, int pvsMin, int pvsMax, String type) {
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
