package presentation;

import metier.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ordinateur> ordinateurs = new ArrayList<>(3);
        ordinateurs.add(new Ordinateur("ord1", "Asus", 8500.0, "description1", new ArrayList<>(), null));
        ordinateurs.add(new Ordinateur("ord2", "HP", 4000.0, "description2", new ArrayList<>(), null));
        ordinateurs.add(new Ordinateur("ord3", "MSI", 12500.0, "description3", new ArrayList<>(), null));


        Categorie categorie = new Categorie("nom", "description", ordinateurs);
        for (Ordinateur o : ordinateurs) {
            o.setCategorie(categorie);
        }

        Client client = new Client("LAZRI", "Amine", "145 Oulfa", "Rabat", "0753258641", "nom@gmail.com", new ArrayList<>());

        Commande commande = new Commande(2689512, client, new Date(), "ETAT", new ArrayList<>());
        client.ajouterCommande(commande);


        List<LigneCommande> ligneDeCommandes = new ArrayList<>(3);


        LigneCommande ligneDeCommande = new LigneCommande(3, ordinateurs.get(0), commande);
        LigneCommande ligneDeCommande1 = new LigneCommande(4, ordinateurs.get(1), commande);
        LigneCommande ligneDeCommande2 = new LigneCommande(1, ordinateurs.get(2), commande);
        ligneDeCommandes.add(ligneDeCommande);
        ligneDeCommandes.add(ligneDeCommande1);
        ligneDeCommandes.add(ligneDeCommande2);
        commande.getLigneCommandes().addAll(ligneDeCommandes);

        ordinateurs.get(0).getLigneCommandes().add(ligneDeCommande);
        ordinateurs.get(1).getLigneCommandes().add(ligneDeCommande1);
        ordinateurs.get(2).getLigneCommandes().add(ligneDeCommande2);


        System.out.println(commande);


    }
}