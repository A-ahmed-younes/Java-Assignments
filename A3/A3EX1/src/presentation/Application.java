package presentation;
import metier.*;

public class Application {
    public static void main(String[] args) {
        Adherent ad1 = new Adherent("nad1","pad1","ad1@gmail.com","0625369845",38,1568);
        Auteur au1 = new Auteur("na1","pa1","a1@gmail.com","0695352841",45,2638);
        Livre l1 = new Livre(25689,au1);
        ad1.afficher();
        l1.afficher();



    }
}
