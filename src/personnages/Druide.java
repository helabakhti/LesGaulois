package personnages;

import java.util.Random;

public class Druide extends Gaulois{
	
	private int puissance_Max=6;
	private int puissance_Min=2;
	

	public Druide(String nom, int force) {
		super(nom, force);
	}
	
	public void fabriquerPotionMagique() {
		Random random = new Random();  
		//random puissance entre 2 et 6
		int puissance=random.nextInt(puissance_Max - puissance_Min + 1) + puissance_Min; 
		int dose = random.nextInt(7);   //int random compris entre 0 et 6
        System.out.println("le druide " + getNom() + " J'ai concocté " + dose +
                " doses de potion magique. Elle a une force de " + puissance );
    }
	

}
