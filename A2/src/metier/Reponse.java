package metier;

public class Reponse {
    private String titre;
    private  boolean correct;

    public Reponse(String titre, boolean correct) {
        this.titre = titre;
        this.correct = correct;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "\t" +titre +'\n';
    }
}
