package personnages;

public class Soldat extends Romain {
    private Grade grade;

    public enum Grade {
        SOLDAT, TESSERARIUS, OPTIO, CENTURION;
    }

    public Soldat(String nom,int force, Grade grade) {
        super(nom,force); 
        this.grade = grade;
    }
    
    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Soldat{" + "nom='" + getNom() + '\'' + ", grade=" + grade +'}';
    }
    
}

