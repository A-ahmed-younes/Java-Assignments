package metier;

import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String telephone;
    private String email;
    List<Commande> commandes;
    public List<Commande> getCommandes() {
        return commandes;
    }
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getVille() {
        return ville;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Client(String nom, String prenom, String adresse, String ville, String telephone, String email, List<Commande> commandes) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        this.telephone = telephone;
        this.email = email;
        this.commandes = commandes;
    }
    public void ajouterCommande(Commande commande) {
        Boolean existe;
        for (Commande c : commandes) {
            if (c.getReference() == commande.getReference()) {
                existe = true;
                return;
            }
        }
        if (existe = false) {
            System.out.println("La commande existe déjà");
        } else {
            commandes.add(commande);
        }

    }
    public void supprimerCommande(Commande commande) {
        if (!commandes.contains(commande)) {
            System.out.println("Cette commande n'existe pas veuillez verifier les informations");
        } else {
            commandes.remove(commande);
        }
    }
    @Override
    public String toString() {
        return "\n******Les informations de client****** : \n" +
                "\nnom de client : " + nom +
                "\nprenom de client : " + prenom +
                "\naddress de client : " + adresse +
                "\nville de client : " + ville +
                "\ntelephone de client : " + telephone +
                "\nemail de client : " + email;
    }
}
