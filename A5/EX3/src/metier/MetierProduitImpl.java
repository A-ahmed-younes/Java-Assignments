package metier;

import java.io.*;
import java.util.Iterator;
import java.util.List;



public class MetierProduitImpl  implements IMetier<Produit>  {

    static String nomFichier;
    List<Produit> produits;


    public MetierProduitImpl(List<Produit> produits,
                             String fich) {
        this.produits = produits;
        nomFichier = fich;
    }

    public Produit add(Produit p) {
        if (!produits.contains(p)) {
            produits.add(p);
            return p;
        } else
            return null;
    }

    public List<Produit> getAll() throws IOException, ClassNotFoundException {

        File f2 = new File(nomFichier);
        if (!f2.exists()) {
            f2.createNewFile();
            return null;
        }
        if (f2.length() == 0) {
            System.out.println("Il y a pas de produits dans le fichier veuillez les ajouter dans le choix 3");
            return null;
        }
        FileInputStream fis = new FileInputStream(f2);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            Produit p;
            do {
                p = (Produit) ois.readObject();
            }while (p!=null);
        } catch (EOFException e) {
// EOF
        }
        ois.close();
        fis.close();

        return produits;

    }


    public Produit findById(long id) {
        for (Produit p : produits) {
            if (p.getId() == id) {
                System.out.println(p);
                return  p;
            }
        }
        System.out.println("Ce produit n'existe pas");
        return null;
    }

    public void delete(long id) {
        for (Iterator<Produit> it = produits.iterator(); it.hasNext(); ) {
            Produit p = it.next();
            if (p.getId() == id) {
                it.remove();
            }

        }
    }
    public void SaveAll() throws IOException {
        File f1 = new File(nomFichier);
        if (!f1.exists()) {
            f1.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(f1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Produit p: produits) {
            if (produits.contains(p)) {
                System.out.println(p);
            }
            oos.writeObject(p);
        }
        oos.reset();
        fos.close();
        System.out.println("Produits sauvgardés");

    }

}
