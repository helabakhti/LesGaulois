package personnages;

public class Romain extends Personnage {
	private String nom;
	private int force;

	public Romain(String nom, int force) {

		super(nom, force);
	}

	@Override
	public String donnerAuteur() {
		return "Romain";
	}




}
