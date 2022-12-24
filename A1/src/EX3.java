import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        int choix;
        int i;
        int wc = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer une chaine :");
        String str = sc.nextLine();
        StringBuilder st = new StringBuilder(str);
        do  {
            System.out.println("Menu des opérations sur une chaîne de caractères");
            System.out.println("1.) Afficher la chaine saisie");
            System.out.println("2.) Inverser la chaine saisie");
            System.out.println("3.) compter le nombre de mots de la chaine");
            System.out.println("4.) Sortir de menu");

            System.out.println("entrer votre choix :");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println(st);
                    System.out.println("Frappez une touche pour revenir au menu");
                    sc.next();
                    break;

                case 2:
                    st.reverse();
                    System.out.println(st);
                    System.out.println("Frappez une touche pour revenir au menu");
                    sc.next();
                    break;

                case 3:
                    for (i = 0; i < st.length(); i++) {
                        if ((st.charAt(i) == ' ') && (st.charAt(i + 1) != ' ')) {
                            wc++;
                        }
                    }
                    System.out.println("le nombre de mots de la chaîne est : " + wc);
                    System.out.println("Frappez une touche pour revenir au menu");
                    sc.next();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("choix non valide veuillez choisir 1-2-3-4-5");
                    System.out.println("Frappez une touche pour revenir au menu");
                    sc.next();
                    break;

            }

        }while (choix !=5);

    }
}
/*import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        int choix;
        int i;
        int wc = 1;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Menu des opérations sur une chaîne de caractères");
            System.out.println("1.) Lire une chaine de characteres ");
            System.out.println("2.) Afficher la chaine saisie");
            System.out.println("3.) Inverser la chaine saisie");
            System.out.println("4.) compter le nombre de mots de la chaine");
            System.out.println("5.) Sortir de menu");

            System.out.println("entrer votre choix :");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("entrer une chaine :");
                    Scanner scc = new Scanner(System.in);
                    String str = scc.nextLine();
                    StringBuilder st = new StringBuilder(str);
                    break;


                case 2:


                    System.out.println(str);
                    break;

                *//*case 3:
                    st.reverse();
                    System.out.println(st);
                    break;

                case 4:


                    for (i = 0; i < st.length(); i++) {
                        if ((st.charAt(i) == ' ') && (st.charAt(i + 1) != ' ')) {
                            wc++;
                        }
                    }
                    System.out.println("Number of words in a string : " + wc);
                    break;
*//*
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("choix non valide veuillez choisir 1-2-3-4-5");
                    break;

            }

        }while(choix!=6);

    }
}*/
