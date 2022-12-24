// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
// Given a string A, print Yes if it is a palindrome, print No otherwise.
// Sample Input

// madam
// Sample Output

// Yes
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        // this code is to reverse the string and compare it with the original string using the StringBuffer class and its methods
        // toString() method is used to convert the StringBuffer object to a String object
        String reverse = new StringBuffer(A).reverse().toString();
        if (A.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
   }

}

        // This is another solution using the StringBuilder class and its methods
        // StringBuilder sb = new StringBuilder(A).reverse().toString();
        // if (A.equals(sb)) {
        //     System.out.println("Yes");
        // } else {
        //     System.out.println("No");
        // }

        // This is another solution without using the StringBuffer or StringBuilder class
        // String StrRev = "";
        // for(int i=A.length()-1;i>=0;i--){  
        //     StrRev = StrRev + A.charAt(i);    
        // }
        // if (StrRev.equalsIgnoreCase(A)){
        //     System.out.println("Yes"); 
        // }
        // else{
        //     System.out.println("No");
        // }


