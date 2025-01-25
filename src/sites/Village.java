package sites;

import personnages.Gaulois;

public class Village {

    private Gaulois chef;
    private Gaulois[] gaulois = new Gaulois[50];
    private int nbHabitants;

    public Village(Gaulois chef) {
        this.chef = chef;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois villageois) {
        if (nbHabitants < gaulois.length) {
            gaulois[nbHabitants] = villageois;
            nbHabitants++;
        } else {
            System.out.println("Village plein");
        }
    }

    public void afficherVillageois() {
        System.out.println("Le village de " + chef + " est habité par :");
        if (nbHabitants > 0) {
            for (int i = 0; i < nbHabitants; i++) {
                System.out.println("- " + gaulois[i]);
            }
        } else {
            System.out.println("Aucun habitant dans le village");
        }
    }
    
	 public void changerChef(Gaulois nvChef) {
	            this.chef = nvChef;
	            System.out.println("Le nouveau commandant est : " + nvChef);
 
    
	 }
    
    
}
