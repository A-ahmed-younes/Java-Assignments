package presentation;
import metier.*;
import metier.MetierProduitImpl;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        IMetierProduit imp = new MetierProduitImpl();
        Produit produit1 = new Produit(12,"PC1","HP",4500,"PC bureau",35);
        Produit produit2 = new Produit(13,"PC2","DELL",7200,"PC bureau",12);
        Produit produit3 = new Produit(14,"PC3","Asus",7200,"PC portable",21);

        imp.add(produit1);
        imp.add(produit2);
        imp.add(produit3);

        int choix;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--------Menu de gestion des produits :--------");
            System.out.println("1- Afficher la liste des produits");
            System.out.println("2- Rechercher des produits par mot clé");
            System.out.println("3- Ajouter un nouveau produit dans la liste");
            System.out.println("4- Récupérer et afficher un produit par ID");
            System.out.println("5- Supprimer un produit par id");
            System.out.println("6- Quitter le menu");
            System.out.println("Veuillez entrer votre choix :");
            choix = sc.nextInt();
            menu:
            switch (choix){
                case 1:
                    System.out.println(imp.getAll());
                    System.out.println("---Appuyer sur entree pour continuer---");
                    System.in.read();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Entrer le mot cle : ");
                    String motCle = sc.nextLine();
                    imp.findByNom(motCle);
                    System.out.println("---Appuyer sur entree pour continuer---");
                    System.in.read();
                    break;

                case 3:
                    System.out.println("entrer l'ID du produit : ");
                    int proId = sc.nextInt();

                    //added the break and label to break the switch statement when the provided ID is a duplicate
                    for (Produit p:imp.getAll()) {
                        if(p.getId() == proId) {
                            System.out.println("Il existe deja un produit avec ce ID veuillez choisir un ID different");
                            System.out.println("---Appuyer sur entree pour continuer---");
                            System.in.read();
                            break menu;
                        }
                    }
                    sc.nextLine();
                    System.out.println("entrer le nom du produit : ");
                    String proNom = sc.nextLine();
                    System.out.println("entrer la marque du produit : ");
                    String proMarque = sc.nextLine();
                    System.out.println("entrer le prix du produit : ");
                    double proPrix = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("entrer la description du produit : ");
                    String proDesc = sc.nextLine();
                    System.out.println("entrer la quantite en stock du produit : ");
                    int proStock = sc.nextInt();
                    imp.add(new Produit(proId,proNom,proMarque,proPrix,proDesc,proStock));
                    System.out.println("---Appuyer sur entree pour continuer---");
                    System.in.read();
                    break;

                case 4:
                    System.out.println("Entrer l'ID de produit pour l'afficher : ");
                    long proID = sc.nextLong();
                    imp.findById(proID);
                    System.out.println("---Appuyer sur entree pour continuer---");
                    System.in.read();
                    break;

                case 5:
                    System.out.println("Entrer l'ID de produit pour le supprimer : ");
                    long ProID = sc.nextLong();
                    imp.delete(ProID);
                    System.out.println("---Appuyer sur entree pour continuer---");
                    System.in.read();
                    break;

                case 6:
                    System.out.println("-------Merci!-------");
                    break;

                default:
                    System.out.println("choix non valide");
                    System.out.println("---Appuyer sur entree pour continuer---");
                    System.in.read();


            }

        }while (choix!=6);



    }
}
