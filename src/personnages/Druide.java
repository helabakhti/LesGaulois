package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {

	private int puissancePotion;
	private int puissance_Max = 6;
	private int puissance_Min = 2;
	private Random random;
 
	public Druide(String nom, int force) {
		super(nom, force);

		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void donnerPotion(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obélix")) {
			return;
		}
		gaulois.boirePotionMagique(puissancePotion);
	}

	public void fabriquerPotionMagique() {
		// puissance random entre 2 et 6
		puissancePotion = random.nextInt(puissance_Max - puissance_Min + 1) + puissance_Min;
		int dose = random.nextInt(7); // compris entre 0 et 6

		System.out.println("le gaulois " + getNom() + " j'ai concocté " + dose
				+ " doses de potion magique. Elle a une force de " + puissancePotion);
	}

	public int getPuissancePotion() {
		return this.puissancePotion;
	}

}
