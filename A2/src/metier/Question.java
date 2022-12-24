package metier;

public class Question {
    private String titre;
    private String description;
    private Reponse []reponses;
    private float score;

    public Question(String titre, String description, Reponse[] reponses, float scores) {
        this.titre = titre;
        this.description = description;
        this.reponses = reponses;
        this.score = scores;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Reponse[] getReponses() {
        return reponses;
    }

    public void setReponses() {
        this.reponses = reponses;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        String quest=  titre +
                " (" + score + ')'+
                "\n" + description + '\n' ;
        for (Reponse rep:reponses) {
            quest+=rep.toString();
        }
        return quest;
    }
}
