package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
		System.out.println(asterix.getNom());
		asterix.parler("bonjour a tous");

		
		Romain romain = new Romain("Minus", 6);
		System.out.println(romain);
		System.out.println(romain.getNom());
		romain.parler("UN GAU… UN GAUGAU… ");
		
		for (int i = 0; i < 2; i++) {
			asterix.frapper(romain);
		}
		
	}

}
