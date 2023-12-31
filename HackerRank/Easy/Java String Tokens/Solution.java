// Given a string s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
// We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens,\
// followed by each token on a new line.
// Input Format
// A single string, s.
// Constraints
// 1 <= length of s <= 4 * 10^5
// s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,),
// question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
// Output Format
// On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique).
// Next, print each of the n tokens on a new line in the same order as they appear in input string s.

// Sample Input
// He is a very very good boy, isn't he?

// Sample Output
// 10
// He
// is
// a
// very
// very
// good
// boy
// isn
// t
// he

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        

        if (s.trim().length() == 0) { //check if the string is empty after removing the leading and trailing spaces
            System.out.println(0);
        } else {
            String[] tokens = s.trim().split("[ !,?.\\_'@]+"); // s.trim() trims the leading and trailing spaces.Split() splits the string using the given delimiters
            System.out.println(tokens.length); //print the number of tokens
            for (String token : tokens) { //print each token
                System.out.println(token);
            }
        } 
               
        scan.close();
    }
}
        

        
