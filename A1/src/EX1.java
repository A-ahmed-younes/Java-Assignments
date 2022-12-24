import java.util.Arrays;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        float n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer le nombre des notes saisies: ");
        n=sc.nextFloat();
        float[] array = new float[(int)n];
        System.out.println("Entrer les notes: ");
        for(int i=0; i<n; i++)
        {

            array[i]=sc.nextFloat();
        }
        Arrays.sort(array);
        System.out.println("les notes sont : ");
        for (int i=0; i<n; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("la note moyenne = " + ((array[(int)n-1]+array[0])/2));
        System.out.println("la note minimale = " + array[0]);
        System.out.println("la note maximale = " + array[(int)n-1]);

        System.out.println("Entrer la note pour avoir l'occurance");
        int ele=sc.nextInt();
        int occ=0;


        for(int i=0;i<n;i++)
        {
            if(ele==array[i])
            {
                occ++;
            }
        }

        System.out.println("le nombre des etudiants ayant "+ele+" est "+occ);
    }
}
