package personnages;

public class Gaulois extends Personnage {
	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	public String donnerAuteur() {
		return "Gaulois";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
		System.out.println(asterix.getNom());
	}

}
