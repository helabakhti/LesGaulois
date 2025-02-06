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
        System.out.println("Le " + donnerAuteur() + " " + nom + " : " + texte);
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force <= 0) {
            force = 0;
            System.out.println("Le " + donnerAuteur() + " " + nom + " : J’abandonne...");
        } else {
            System.out.println("Le " + donnerAuteur() + " " + nom + " : Aïe !");
        }
    }

    // Methode de frappe en fonction du type de personnage
    public void frapper(Personnage personnage) {
        int forceCoup = force;

        // Exemple de réduction de force en fonction de la classe
        if (personnage instanceof Romain) {
            System.out.println(donnerAuteur() + " " + nom + " envoie un grand coup de force " + forceCoup + " au romain " + personnage.getNom() + ".");
            personnage.recevoirCoup(forceCoup / 3);
        } else if (personnage instanceof Gaulois) {
            System.out.println(donnerAuteur() + " " + nom + " envoie un grand coup de force " + forceCoup + " au gaulois " + personnage.getNom() + ".");
            personnage.recevoirCoup(forceCoup / 3);
        }
    }

    public boolean estATerre() {
        return force <= 0;
    }
}
