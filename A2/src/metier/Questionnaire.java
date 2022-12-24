package metier;

import java.util.Arrays;

public class Questionnaire {

    private String titre;

    private Question []questions;

    public Questionnaire(String titre, Question[] questions) {
        this.titre = titre;
        this.questions = questions;
    }

    public String getTitre() {
        return titre;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public void affiche(){
        System.out.println("Titre:\t"+this.titre+"\n");
        for (int i=0;i<this.questions.length;i++){
            System.out.println((i+1)+")"+questions[i].toString());
            questions[i].setReponses();
        }

    }

    public float scoreTotale(){
        float scoreT=0;
        for (int i=0;i<this.questions.length;i++){
            scoreT+=questions[i].getScore();
        }
        return scoreT;
    }


    @Override
    public String toString() {
        return "Questionnaire{" +
                "titre='" + titre + '\'' +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
}
