package metier;

public class Ingenieur extends Employe {
    private String specialite;
    public Ingenieur(String nom, String prenom, String email, String tel, int salaire, String specialite) {
        super(nom, prenom, email, tel, salaire);
        this.specialite = specialite;
    }

    public int calculerSalire(int salaire) {
        salaire = salaire + ((salaire/100)*15);
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString()+"\nIngenieur{" +
                "specialite='" + specialite + '\'' +
                "}\n";
    }
}
