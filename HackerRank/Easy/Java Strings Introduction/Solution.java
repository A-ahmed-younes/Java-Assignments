// The elements of a String are called characters. The number of characters in a String is called 
// the length, and it can be retrieved with the String.length() method.
// Given two strings of lowercase English letters, A and B, perform the following operations:
// 1. Sum the lengths of A and B.
// 2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
// 3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
// Sample Input 0

// hello
// java
// Sample Output 0

// 9
// No
// Hello Java

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        int l = A.length() + B.length();
        System.out.println(l);
        // the compareTo method compares two strings lexicographically. The comparison is based on the Unicode
        // value of each character in the strings. It returns an integer value. If the result is 0, it means that
        // the strings are equal. If the result is a positive number, it means that the first string is lexicographically
        // greater than the second string. If the result is a negative number, it means that the first string is
        // lexicographically smaller than the second string.
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        // This takes two strings A and B and creates two new strings a and b by extracting the 
        // first character of each string using substring(0,1) (The extraction starts at index 0 and ends before index 1)
        // and then converting it to uppercase using toUpperCase()
        // and then concatenating the rest of the string using substring(1) (The extraction starts at index 1 and ends at the end of the string).
        String a = A.substring(0,1).toUpperCase() + A.substring(1);
        String b = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(a + " " + b);
    }
}