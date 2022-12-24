package presentation;

import metier.EntierNaturel;
import metier.NombreNegatifException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrer la valeur : ");
            int v = sc.nextInt();
            EntierNaturel e1 = new EntierNaturel(v);
            System.out.println("Valeur : "+e1.getVal());
            e1.decrementer();
            System.out.println("Valeur après décrémentation : "+e1.getVal());
            e1.setVal(-2);

        } catch (NombreNegatifException NNE) {
            System.err.println(NNE.getMessage());
            System.err.println("Valeur erronee : "+NNE.getValeurErronee());
        }
    }
}
