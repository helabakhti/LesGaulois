package personnages;

public class Gaulois {

	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;

	}

	public void parler(String text) {
		System.out.println("Le Gaulois " + nom + " : " + text);
	}

	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix" , 8);
		System.out.println(asterix);
		System.out.println(asterix.getNom());
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom() + ".");
		
	}
	public void afficherForce() {
        System.out.println(nom + " a " + force + " de force.");
    }
}
