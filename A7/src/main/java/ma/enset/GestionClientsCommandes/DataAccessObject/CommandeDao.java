package ma.enset.GestionClientsCommandes.DataAccessObject;

import ma.enset.GestionClientsCommandes.DBI.DBInteraction;
import ma.enset.GestionClientsCommandes.Etities.Commande;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CommandeDao implements Dao<Commande> {


    @Override
    public void add(Commande c) {
        DBInteraction.connect();
        String req = "insert into commandes (reference, dateCreation, prix, idClient ) values ('" + c.getReference() + "','" + c.getDateCreation() + "'," + c.getPrix() + ", " + c.getClient().getId() + ")";
        Boolean result  = DBInteraction.update(req);
        if (result) {
            System.out.println("Commandes added");
        } else {
            System.out.println("Commandes not added");
        }
        DBInteraction.disconnect();
    }

    @Override
    public void update(Commande c) {
        DBInteraction.connect();
        String sql = "UPDATE `commandes` SET `reference` = '"+c.getReference()+"', `dateCreation` = '"+c.getDateCreation()+"', `prix` = "+c.getPrix()+", `idClient` = "+ c.getClient().getId()+" WHERE `commandes`.`id` = "+c.getId();
        Boolean result  = DBInteraction.update(sql);
        if (result){
            System.out.println("update success");
        }else {
            System.out.println("update failed");
        }
        DBInteraction.disconnect();
    }

    @Override
    public void delete(Commande t) {
        DBInteraction.connect();
        Boolean result  = DBInteraction.update("delete from commandes where id = "+t.getId());
        if (result){
            System.out.println("Commande supprimé");
        }else {
            System.out.println("Commande non supprimé");
        }
        DBInteraction.disconnect();
    }

    @Override
    public Commande findById(int id) {
        DBInteraction.connect();
        String sql = "select * from commandes where id = " + id;
        ResultSet rs = DBInteraction.select(sql);
        Commande c = new Commande();
        try {
            while (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setReference(rs.getString("reference"));
                c.setDateCreation(rs.getString("dateCreation"));
                c.setPrix(rs.getDouble("prix"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DBInteraction.disconnect();
        return c;
    }

    @Override
    public List<Commande> findAll() {
        DBInteraction.connect();
        ResultSet rs = DBInteraction.select("select * from commandes");
        List<Commande> commandes = new ArrayList<>();
        try {
            while (rs.next()) {
                Commande commande = new Commande();
                commande.setId(rs.getInt("id"));
                commande.setDateCreation(rs.getString("dateCreation"));
                commande.setReference(rs.getString("reference"));
                commande.setPrix(rs.getDouble("prix"));
                commande.setClient(new ClientDao().findById(rs.getInt("idClient")));
                commandes.add(commande);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DBInteraction.disconnect();
        return commandes;
    }

    @Override
    public void deleteAll() {
        DBInteraction.connect();
        Boolean result  = DBInteraction.update("delete from commandes");
        if (result){
            System.out.println("Commandes supprimés");
        }else {
            System.out.println("Commandes non supprimés");
        }
        DBInteraction.disconnect();
    }

}
