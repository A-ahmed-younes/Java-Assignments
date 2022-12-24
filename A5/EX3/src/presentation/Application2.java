package presentation;
import metier.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Client> clientsG= new ArrayList<>();
        IMetier<Client> imp = new MetierClientImpl(clientsG,"clients.dat");

        int choix;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--------Menu de gestion des clients :--------");
            System.out.println("1- Afficher la liste des clients");
            System.out.println("2- Rechercher un client par son id");
            System.out.println("3- Ajouter un nouveau client dans la liste");
            System.out.println("4- Supprimer un client par id");
            System.out.println("5- Sauvegarder les clients");
            System.out.println("6- Quitter le menu");
            System.out.println("Veuillez entrer votre choix :");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    clientsG = imp.getAll();
                    for(Client c:clientsG){
                        System.out.println(c.toString());
                    }
                    break;

                case 2:
                    System.out.println("Entrer l'id de client : ");
                    long pid = sc.nextLong();
                    sc.nextLine();
                    imp.findById(pid);
                    break;

                case 3:
                    System.out.println("entrer le nom du client : ");
                    String clientNom = sc.nextLine();
                    System.out.println("entrer la prenom du client : ");
                    String clientPrenom = sc.nextLine();
                    System.out.println("entrer l'adresse du client : ");
                    String clientAdr = sc.nextLine();
                    System.out.println("entrer le tel du client : ");
                    String clientTel = sc.nextLine();
                    System.out.println("entrer l'email du client : ");
                    String clientEmail = sc.nextLine();
                    imp.add(new Client(clientNom,clientPrenom,clientAdr,clientTel,clientEmail));
                    break;

                case 4:
                    System.out.println("Entrer l'id de client a supprimer : ");
                    long pSupp = sc.nextLong();
                    imp.delete(pSupp);
                    break;

                case 5:
                    imp.SaveAll();
                    break;

                case 6:
                    System.out.println("-------Merci!-------");
                    break;

                default:
                    System.out.println("choix non valide");




            }
        } while (choix != 6);
    }
}
