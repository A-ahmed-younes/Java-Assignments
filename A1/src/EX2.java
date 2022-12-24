import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer un verbe :");
        String verbe=sc.nextLine();
        if(verbe.endsWith("er")){
            String radical = verbe.substring(0,verbe.length()-2);
            System.out.println("Je "+radical+"e" );
            System.out.println("Tu "+radical+"es" );
            System.out.println("il/elle "+radical+"e" );
            System.out.println("Nous "+radical+"ons" );
            System.out.println("Vous "+radical+"ez" );
            System.out.println("ils/elles "+radical+"ent" );
        }
        else{
            System.out.println("Veuillez entrer un verbe de premier groupe");
        }
    }
}
