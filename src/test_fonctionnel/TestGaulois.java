package test_fonctionnel;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Soldat;
import personnages.Soldat.Grade;

public class TestGaulois {

    public static void main(String[] args) {
      
        Druide Panoramix = new Druide("Panoramix", 5);
        Gaulois asterix = new Gaulois("Astérix", 5);

        Soldat romain = new Soldat("Minus", 6, Grade.CENTURION);
       
        System.out.println("Le soldat Minus s'équipe avec un bouclier.");
        romain.equiper(Equipement.BOUCLIER);
        
        System.out.println("Le soldat Minus s'équipe avec un casque.");
        romain.equiper(Equipement.CASQUE);
        
        System.out.println("Le soldat Minus s'équipe avec un plastron.");
        romain.equiper(Equipement.PLASTRON);

    
        Panoramix.fabriquerPotionMagique();
        asterix.boirePotionMagique(Panoramix.getPuissancePotion());

        Panoramix.parler("Tiens asterix un peu de potion magique");
        Panoramix.parler("Non, Obélix Non !... Et tu le sais très bien !");
        Panoramix.parler("Tiens Assurancetourix un peu de potion magique");
        Panoramix.parler("Tiens Abraracourcix un peu de potion magique");
        Panoramix.parler("Désolé Agecanonix il n'y a plus une seule goutte de potion");

        asterix.parler("Bonjour à tous");

        romain.parler("UN GAU... UN GAUGAU...");

        while (!asterix.estATerre() && !romain.estATerre()) {
            asterix.frapper(romain);  
            if (romain.estATerre()) {
                break;
            }
        }

}
}
