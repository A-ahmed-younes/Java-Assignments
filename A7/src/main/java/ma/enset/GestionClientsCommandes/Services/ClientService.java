package ma.enset.GestionClientsCommandes.Services;

import ma.enset.GestionClientsCommandes.Etities.Client;

import java.util.List;

public interface ClientService {
    public void add(Client client);
    public void update(Client client);
    public void delete(Client client);
    public Client findById(int id);
    public void deleteAll();
    public List<Client> findAll();

}
