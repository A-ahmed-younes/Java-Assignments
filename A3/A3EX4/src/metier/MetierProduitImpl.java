package metier;

import java.util.*;

public class MetierProduitImpl implements IMetierProduit {
    ArrayList<Produit> produits = new ArrayList<>();

    public Produit add(Produit p) {
        if (!produits.contains(p)) {
            produits.add(p);
            return p;
        } else
            return null;
    }
    public List<Produit> getAll() {

        return produits;

    }

    public List<Produit> findByNom(String motCle) {
        ArrayList<Produit> ListMotCle = new ArrayList<>();
        for (Produit p : produits) {
            if (Objects.equals(p.getNom(), motCle)) {
                ListMotCle.add(p);
            }

        }
        if(ListMotCle.isEmpty()){
            System.out.println("Ce produit n'existe pas veuillez choisir l'option 3 pour l'ajouter");
            return null;

        }
        System.out.println(ListMotCle);

        return ListMotCle;
    }

    public Produit findById(long id) {
        Produit pid = new Produit();
        for (Produit p : produits) {
            if (p.getId() == id) {
                pid = p;
            }
        }
        if (pid.getId()==0) {
            System.out.println("Ce produit n'existe pas veuillez choisir l'option 3 pour l'ajouter");
            return null;
        }
        System.out.println(pid);
            return pid;


    }

    public void delete(long id) {
        for (Iterator<Produit> it = produits.iterator(); it.hasNext();) {
            Produit p = it.next();
            if (p.getId() == id) {
                it.remove();
            }


        }

    }
}
