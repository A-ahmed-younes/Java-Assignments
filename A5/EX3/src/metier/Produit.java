package metier;

import java.io.Serializable;

public class Produit implements Serializable {

    private static int counter = 0;

    private long id;
    private String nom;
    private String marque;
    private String description;

    private float prix;
    private int nbrstock;

    public Produit(String nom, String marque, String description, float prix, int nbrstock) {
        this.id = ++counter;
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.nbrstock = nbrstock;
    }

    public Produit() {
    }

    public long getId() {
        return id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getNombre() {
        return nbrstock;
    }

    public void setNombre(int nbrstock) {
        this.nbrstock = nbrstock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", nbrstock=" + nbrstock +
                '}';
    }
}


