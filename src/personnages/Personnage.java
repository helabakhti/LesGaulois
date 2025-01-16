package personnages;

public abstract class Personnage {

	protected String nom;
	protected int force;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public abstract String donnerAuteur();

	public void parler(String texte) {
		System.out.println("le " + donnerAuteur() + " " + nom +" : " + texte );
	}

	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force < 0) {
			force = 0;
			System.out.println("Le romain " + nom + " :  Aie ! ");
		} else {
			System.out.println("Le romain " + nom + " :  J'abandonne...");
		}
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom() + ".");
		romain.recevoirCoup(force / 3);
	}
	
	public void frapper(Gaulois gaulois) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + gaulois.getNom() + ".");
		gaulois.recevoirCoup(force / 3);
	}

}
