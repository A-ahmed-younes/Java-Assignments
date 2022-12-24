package presentation;

import metier.Question;
import metier.Reponse;
import metier.Questionnaire;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int choix=0;
        String titreQs="";
        Question[] questions={};
        Questionnaire qs=new Questionnaire("",questions);
        String Qtitre;
        float Qscore;
        String titreRep;
        boolean option;

        do{
            System.out.println(" **** Menu Questionnaire ****");
            System.out.println(" 1) Remplir la Questionnaire ");
            System.out.println(" 2) Afficher la Questionnaire ");
            System.out.println(" 3) Afficher la note : ");
            System.out.println(" 4) Quitter");
            System.out.println("Entrer un choix : ");
            choix=scanner2.nextInt();
            switch (choix){
                case 1:System.out.println("Veuillez saisir la questionnaire : ");
                    System.out.println("Entrer le titre de questionnaire:");
                    titreQs=sc.nextLine();
                    System.out.println("Entrer le nombre des questions :");
                    int nb_q=scanner2.nextInt();
                    questions=new Question[nb_q];
                    scanner2.nextLine();
                    for (int i=0;i<nb_q;i++){
                        Reponse[] responsesQ=new Reponse[3];
                        System.out.println("Entrer le titre de la question "+(i+1)+":");
                        Qtitre=sc.nextLine();
                        System.out.println("Entrer le score de la question "+(i+1)+":");
                        Qscore=scanner2.nextInt();
                        for (int j=0;j<3;j++){
                            System.out.println("Entrer la reponse"+(j+1)+":");
                            titreRep=sc.nextLine();
                            System.out.println("Entrez les choix possible de la reponse:(true ou false)");
                            option=scanner2.nextBoolean();
                            responsesQ[j]=new Reponse(titreRep,option);
                        }
                        questions[i]=new Question(Qtitre,"",responsesQ,Qscore);

                    }
                    break;
                case 2:System.out.println("Voici la questionnaire : ");
                    qs = new Questionnaire(titreQs, questions);
                    qs.affiche();
                    break;
                case 3: System.out.println("******* Afficher resultat *******");


                    System.out.println("\n Votre Score est: "+qs.scoreTotale()+"/"+questions.length);
            }
        }while (choix!=4);

    }
}
