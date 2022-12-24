package metier;

import java.util.ArrayList;
import java.io.*;
public class DossierContact {
    //list of contacts' names
    private ArrayList<String> noms = new ArrayList<>();
    //list of contacts' phone numbers
    private ArrayList<String> nums = new ArrayList<>();

    public DossierContact(ArrayList<String> noms, ArrayList<String> nums) {
        this.noms = noms;
        this.nums = nums;
    }

    //method to add a contact to a file that has the same name and contains the phone number of the contact
    public void addContact(String name, String num) throws IOException {
        File f1 = new File("DossierContact\\", name + ".txt");
        if (!f1.exists()) {
            f1.createNewFile();
            FileWriter fw = new FileWriter(f1);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(num);
            bw.close();
            noms.add(name);
            nums.add(num);
        }
        else {
            System.out.println("Ce Contact existe deja");
        }
    }

    public void removeContact(String name) {
        File f1 = new File("DossierContact\\", name + ".txt");
        if (f1.exists()) {
            f1.delete();
            System.out.println("Le contact avec le nom " + name + " est supprimé");
        } else {
            System.out.println("Ce Contact n'existe pas");
        }
        int i = noms.indexOf(name);
        if (i != -1) {
            noms.remove(i);
            nums.remove(i);
        }
    }
    public boolean searchContact(String name) {
        if(noms.contains(name)){
            int index = noms.indexOf(name);
            //System.out.println("Le nom de contact : " + name);
            System.out.println("Le numero de contact : " + nums.get(index));
            return true;

        }
        else {
            System.out.println("Ce Contact n'existe pas");
            return false;
        }
    }

    //method to change contact's number
    public void changeNumContact(String name, String num) throws IOException {
        File d1 = new File("DossierContact");
        for (File f:d1.listFiles()) {
            if (f.getName().equals(name + ".txt")) {
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(num);
                bw.close();
            }
        }
        int index = noms.indexOf(name);
        if (index!= -1) {
            nums.set(index, num);
        }
    }
}

