package metier;

public class Manager extends Employe {

    private String serivce;
    public Manager(String nom, String prenom, String email, String tel, int salaire, String serivce) {
        super(nom, prenom, email, tel, salaire);
        this.serivce = serivce;
    }

    public int calculerSalire(int salaire) {
        salaire = salaire + ((salaire/100)*20);
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString()+"\nManager{" +
                "serivce='" + serivce + '\'' +
                "}\n";
    }
}
