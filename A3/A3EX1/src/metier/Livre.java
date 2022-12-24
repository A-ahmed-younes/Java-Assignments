package metier;

public class Livre {
    private int ISBN;
    Auteur infoAuteur;

    public Livre(int ISBN, Auteur infoAuteur) {
        this.ISBN = ISBN;
        this.infoAuteur = infoAuteur;
    }

    @Override
    public String toString() {
        return infoAuteur.toString()+"\nLivre{" +
                "ISBN=" + ISBN +
                '}';
    }
    public void afficher() {
        System.out.println(this.toString());
    }

}
