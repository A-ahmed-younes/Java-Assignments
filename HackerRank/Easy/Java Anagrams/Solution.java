// Two strings a and b, are called anagrams if they contain all the same characters in the same frequencies.
// For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
//Complete the isAnagram function in the editor.

// isAnagram has the following parameters :
// string a: the first string
// string b: the second string
// returns boolean: If a and b are case-insensitive anagrams, return true; otherwise, return false.

// Sample Input 0

// anagram
// margana
// Sample Output 0

// Anagrams

import java.util.Scanner;

public class Solution {

    /**
 * This method determines if two strings are anagrams.
 * @param a - the first string
 * @param b - the second string
 * @return - true if the strings are anagrams, false otherwise
 */
static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
        return false;
    }
    a = a.toLowerCase();
    b = b.toLowerCase();
    int[] count = new int[26];
    for (int i = 0; i < a.length(); i++) {
        count[a.charAt(i) - 'a']++;
        count[b.charAt(i) - 'a']--;
    }
    for (int i = 0; i < 26; i++) {
        if (count[i] != 0) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
