package metier;

public abstract class Employe {
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int salaire;

    public Employe(String nom, String prenom, String email, String tel, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.salaire = salaire;
    }

    public abstract int calculerSalire(int salaire);

    public int getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", salaire=" + calculerSalire(salaire) +
                '}';
    }
}
