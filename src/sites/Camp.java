package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[80];
	private int nbSoldats;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
		System.out.println();
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public void ajouterSoldat(Soldat soldat) {
		if (nbSoldats < soldats.length) {
			soldats[nbSoldats] = soldat;
			nbSoldats++;
		} else {
			System.out.println("Le camp est plein");
		}
	}
	
	public void afficherCamp() {
		        System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");
		        if (nbSoldats > 0) {
		            for (int i = 0; i < nbSoldats; i++) {
		                System.out.println("- " + soldats[i].getNom());
		            }
		        } else {
		            System.out.println("Aucun soldat dans le camp");
		        }
		
	}
	
	 public void changerCommandant(Soldat nvCommandant) {
	        if (nvCommandant.getGrade().equals(Soldat.Grade.CENTURION)) {
	            this.commandant = nvCommandant;
	            System.out.println("Le nouveau commandant est : " + nvCommandant);
	        } else {
	            System.out.println("Le soldat doit etre un centurion!!!");
	        }
	    }
	
	

}
