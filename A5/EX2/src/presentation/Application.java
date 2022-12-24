package presentation;
import metier.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {

        int choix;
        Scanner sc = new Scanner(System.in);
        DossierContact dc = new DossierContact(new ArrayList<String>(),new ArrayList<String>());


        do {
            System.out.println("--------Menu de gestion d'annuaire téléphonique :--------");
            System.out.println("1- Rechercher un numéro de téléphone");
            System.out.println("2- Ajouter un nouveau contact");
            System.out.println("3- Supprimer un contact");
            System.out.println("4- Changer le numéro de téléphone d’un contact");
            System.out.println("5- Quitter le menu");
            System.out.println("Veuillez entrer votre choix :");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Entrer le nom de contact a rechercher : ");
                    String nomCont = sc.nextLine();
                    dc.searchContact(nomCont);
                    break;

                case 2:
                    System.out.println("Entrer le nom de contact a ajouter : ");
                    String nomContact = sc.nextLine();
                    System.out.println("Entrer le numéro de contact a ajouter : ");
                    String numContact = sc.nextLine();
                    dc.addContact(nomContact,numContact);
                    break;

                case 3:
                    System.out.println("Entrer le nom de contact a supprimer : ");
                    String suppContact = sc.nextLine();
                    dc.removeContact(suppContact);
                    break;

                case 4:
                    System.out.println("Entrer le nom de contact : ");
                    String nomContactCh = sc.nextLine();
                    System.out.println("Entrer le nouveau numéro de contact : ");
                    String numContactCh = sc.nextLine();
                    dc.changeNumContact(nomContactCh,numContactCh);
                    break;

                case 5:
                    System.out.println("-------Merci!-------");
                    break;

                default:
                    System.out.println("choix non valide");


            }
        } while (choix != 5);
    }
}
