package personnages;

public class Gaulois extends Personnage {

    private int puissancePotion = 1;

    public Gaulois(String nom, int force) {
        super(nom, force);
    }

    public void boirePotionMagique(int puissancePotion) {
        if (nom.equals("Obélix")) {
            System.out.println(nom + " n'a pas le droit de boire de la potion !");
        } else {
            System.out.println("Le gaulois " + nom + " boit une potion magique de puissance " + puissancePotion + " !");
            this.puissancePotion = puissancePotion;
        }
    }

    public void frapper(Romain romain) {
        int coup = (int) (force * puissancePotion);

        System.out.println("Le gaulois " + this.nom + " donne un grand coup de force " + coup + " au romain " + romain.getNom() + ".");
        romain.recevoirCoup(coup);
    }

    @Override
    public String donnerAuteur() {
        return "Gaulois";
    }

    @Override
    public String toString() {
        return nom;
    }
}
