package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Soldat;
import sites.Village;

public class TestGaulois {

	public static void main(String[] args) {

		// Gaulois vercingetorix = new Gaulois("Vercingetorix", 5);
		// Village village = new Village(vercingetorix);
		// System.out.println(vercingetorix.getNom());
		// vercingetorix.parler("Je suis un grand guerrier et je vais creer mon
		// village");

		// Romain romain = new Romain("Minus", 2);
		// romain.parler("Je suis en charge de créer un nouveau camp romain");

		//Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		//Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		//Gaulois astérix = new Gaulois("Astérix ", 5);
		//Gaulois obelix = new Gaulois("Obelix ", 15);
		//Gaulois prolix = new Gaulois("Prolix ", 2);

		//Soldat Brutus = new Soldat("Brutus", 5, Soldat.Grade.CENTURION);
		//Brutus.parler("Je mets mon épée au service de Rome dans le camp dirigé par Minu");

		//Soldat Milexcus = new Soldat("Milexcus", 5, Soldat.Grade.CENTURION);
		//Milexcus.parler("Je mets mon épée au service de Rome dans le camp dirigé par Minu");

		//Soldat Tullius = new Soldat("Tullius Octopus", 5, Soldat.Grade.CENTURION);
		//Tullius.parler("Je mets mon épée au service de Rome dans le camp dirigé par \r\n" + "Minus");

		//Romain romain = new Romain("Minus", 2);
		//romain.parler("Désolé Ballondebaudrus notre camp est complet ! »");

		Gaulois vercingetorix = new Gaulois("Vercingetorix", 5);
		vercingetorix.parler("Je laisse mon grand bouclier au grand Abraracourcix");
		//vercingetorix.parler("Bienvenue Agecanonix ! ");
		//vercingetorix.parler("Bienvenue Assurancetourix ! ");
		//vercingetorix.parler("Bienvenue asterix ! ");
		//vercingetorix.parler("Bienvenue obelix ! ");
		//vercingetorix.parler("Désolé Prolix mon village est déjà bien rempli. ");
		
		Gaulois abraracourcix= new Gaulois("abraracourcix", 5);
		abraracourcix.parler("Merci ! ");
		Soldat Briseradius = new Soldat("Briseradius",4,Soldat.Grade.SOLDAT);
		Briseradius.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
	
		Soldat Chorus = new Soldat("Chorus",4,Soldat.Grade.CENTURION);
		Chorus.parler("Moi Chorus je prends la direction du camp romain");

	}

}
