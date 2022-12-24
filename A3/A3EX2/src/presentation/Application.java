package presentation;
import metier.*;

public class Application {
    public static void main(String[] args) {
        Ingenieur ing1 = new Ingenieur("noming1","prenoming1","ing1@gmail.com","0658963255",10000,"developpement web");
        System.out.println(ing1);
        Manager manager1 = new Manager("nommanager1","prenommanager1","manager1@gmail.com","0643165986",10000,"info");
        System.out.println(manager1);

        //System.out.println("le salaire de ing1 est : " + ing1.calculerSalire(ing1.getSalaire()));
    }
}
