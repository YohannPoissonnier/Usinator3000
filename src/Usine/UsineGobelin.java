package Usine;

public class UsineGobelin {
	public UsineGobelin() {
		
		
	}
	public Gobelin getGobelin(String typeGobelin) {
		Gobelin gobelin = null;
		
		if(typeGobelin != null) {
			switch (typeGobelin) {
			case "combattant": System.out.println("1");
					gobelin = new GobelinCombattant(5, 20, 0, 20, "combattant");
					break;
			case "explorateur": System.out.println("2");
					gobelin = new GobelinExplorateur(0, 10, 0, 10, "explorateur");
					break;
			case "demineur": System.out.println("3");
					gobelin = new GobelinDemineur(10, 30, 0, 15, "demineur");
					break;
			case "chasseur": System.out.println("4");
					gobelin = new GobelinChasseur(0, 10, 0, 15, "chasseur");
					break;
			case "musicien": System.out.println("5");
					gobelin = new GobelinMusicien(0, 5, 0, 10, "musicien");
					break;
		}
		}
		
		return gobelin;
		
	}
}
