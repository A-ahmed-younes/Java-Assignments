// Sample Input

// java 100
// cpp 65
// python 50
// Sample Output

// ================================
// java           100 
// cpp            065 
// python         050 
// ================================

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                // print the string and integer in a formatted manner
                // %-15s is used to format the string, so that it takes up a minimum of 15 characters and is left-justified
                // %03d is used to format the integer so that it takes up at least 3 digits and leading zeroes are added if necessary
                // %n is used to add a newline character after the formatted string and integer
                System.out.printf("%-15s%03d%n",s1,x);
                //Complete this line
            }
            System.out.println("================================");

    }
}
