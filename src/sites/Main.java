package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Main {
    public static void main(String[] args) {
    	
        Gaulois chef = new Gaulois("Vercingétorix", 0);
        Village village = new Village(chef);

       
        village.ajouterVillageois(new Gaulois("Agecanonix", 1));
        village.ajouterVillageois(new Gaulois("Assurancetourix", 2));
        village.ajouterVillageois(new Gaulois("Astérix", 5));
        village.ajouterVillageois(new Gaulois("Obelix", 15));

        village.afficherVillageois();

        // Création des soldats et du commandant pour le camp
        Soldat commandant = new Soldat("Minus", 2, null);
        Camp camp = new Camp(commandant);

        // Ajouter des soldats au camp
        camp.ajouterSoldat(new Soldat("Brutus", 5, Soldat.Grade.OPTIO));
        camp.ajouterSoldat(new Soldat("Milexcus", 2, Soldat.Grade.CENTURION));
        camp.ajouterSoldat(new Soldat("Tullius Octopus", 2, Soldat.Grade.OPTIO));
        camp.ajouterSoldat(new Soldat("Ballondebaudrus", 3, Soldat.Grade.TESSERARIUS));

        camp.afficherCamp();
    }
}
