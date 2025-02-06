package personnages;

public class Soldat extends Romain {
    private Grade grade;
    private Equipement[] equipements;

    public enum Grade {
        SOLDAT, TESSERARIUS, OPTIO, CENTURION;
    }

    public Soldat(String nom, int force, Grade grade) {
        super(nom, force);
        this.grade = grade;
        equipements = new Equipement[3];
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Soldat{" + "nom='" + getNom() + '\'' + ", grade=" + grade + '}';
    }

    @Override
    public void parler(String message) {
        System.out.println("Le soldat " + getNom() + " de grade (" + grade + "): " + message);
    }

    public void equiper(Equipement equipement) {
        for (Equipement eq : equipements) {
            if (eq == equipement) {
                System.out.println("Le soldat " + getNom() + " possède déjà un " + equipement + ".");
                return;
            }
        }

 
        for (int i = 0; i < equipements.length; i++) {
            if (equipements[i] == null) {
                equipements[i] = equipement;
                System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement + ".");
                return;
            }
        }
        System.out.println("Le soldat " + getNom() + " ne peut pas porter plus d'équipements !");
    }

    @Override
    public void recevoirCoup(int forceCoup) {
        int reduction = 0;

        for (Equipement eq : equipements) {
            if (eq != null) {
                reduction += eq.getReduction();
                System.out.println(eq + " absorbe " + eq.getReduction() + " du coup.");
            }
        }

        int force = Math.max(0, forceCoup - reduction);
        super.recevoirCoup(force);
    }
}
