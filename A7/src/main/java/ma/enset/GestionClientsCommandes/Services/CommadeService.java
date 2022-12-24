package ma.enset.GestionClientsCommandes.Services;

import ma.enset.GestionClientsCommandes.Etities.Commande;

import java.util.List;

public interface CommadeService {
    public void add(Commande commande);
    public void update(Commande commande);
    public void delete(Commande commande);
    public Commande findById(int id);
    public void deleteAll();
    public List<Commande> findAll();
}
