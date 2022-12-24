import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        String str;
        int i, len;
        int nb_occurrences[] = new int[256];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une ligne de texte (max. 100 caractères) : ");
        str = scanner.nextLine();
        String cutString = str.substring(0, Math.min(str.length(), 100));
        len = cutString.length();

        for (i = 0; i < len; i++)
        {
            nb_occurrences[(int) cutString.charAt(i)]++;
        }

        for (i = 0; i < 256; i++)
        {
            if (nb_occurrences[i] != 0)
            {

                System.out.println(nb_occurrences[i]+" fois la lettre "+(char) i);

            }
        }
    }


}

