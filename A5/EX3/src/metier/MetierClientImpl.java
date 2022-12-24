package metier;

import java.io.*;
import java.util.Iterator;
import java.util.List;
public class MetierClientImpl implements IMetier<Client>{
    static String nomFichier;
    List<Client> clients;

    public MetierClientImpl(List<Client> clients,
                             String fich) {
        this.clients = clients;
        nomFichier = fich;
    }

    public Client add(Client c) {
        if (!clients.contains(c)) {
            clients.add(c);
            return c;
        } else
            return null;
    }
    public List<Client> getAll() throws IOException, ClassNotFoundException {

        File f2 = new File(nomFichier);
        if (!f2.exists()) {
            f2.createNewFile();
            return null;
        }
        if (f2.length() == 0) {
            System.out.println("Il y a pas de clients dans le fichier veuillez les ajouter dans le choix 3");
            return null;
        }
        FileInputStream fis = new FileInputStream(f2);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            Client c;
            do {
                c = (Client) ois.readObject();
            }while (c!=null);
        } catch (EOFException e) {
// EOF
        }
        ois.close();
        fis.close();
        return clients;
    }

    public Client findById(long id) {
        for (Client c : clients) {
            if (c.getId() == id) {
                System.out.println(c);
                return  c;
            }
        }
        System.out.println("Ce client n'existe pas");
        return null;
    }

    public void delete(long id) {
        for (Iterator<Client> it = clients.iterator(); it.hasNext(); ) {
            Client p = it.next();
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
        for (Client c: clients) {
            if (clients.contains(c)) {
                System.out.println(c);
            }
            oos.writeObject(c);
        }
        oos.reset();
        fos.close();
        System.out.println("Clients sauvgardés");


    }


}
