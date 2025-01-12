package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String text) {
		System.out.println("Le romain " + nom + " : " + text);
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force < 0) {
			force = 0;
		}

		if (force > 0) {
			System.out.println("Le romain " + nom + " :  Aie ! ");
		} else {
			System.out.println("Le romain " + nom + " :  J'abandonne...");
		}
	}
	
	

}
