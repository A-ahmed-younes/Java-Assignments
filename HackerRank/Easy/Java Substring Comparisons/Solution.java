// Given a string, s, and an integer k, complete the function so that it finds the lexicographically smallest and largest 
// substrings of length k.
// Sample Input 0

// welcometojava
// 3
// Sample Output 0

// ava
// wel 
// In this example the length is 3 the first substring is ava and the second substring is wel. The first substring is lexicographically
// smaller than the second substring.

import java.util.Scanner;

public class Solution {
    /* 1. We first create two empty strings smallest and largest.
    2. Then we create another string str.
    3. We loop through the string s with a for loop from 0 to the length of the string minus k (because we want k characters in the substring).
    4. We create a substring of s from i to i + k and store it in str.
    5. We then check if i is equal to 0 (if it is the first time we are looping through the string). If so, we set smallest and largest equal to str.
    6. If this is not the first time we are looping through the string, we check if str is smaller than smallest. If so, we set smallest equal to str.
    7. We then check if str is larger than largest. If so, we set largest equal to str.
    8. Finally we return smallest and largest with a new line between them. */

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";
        String str = "";
        for(int i = 0; i <= s.length() - k; i++){
            str = s.substring(i, i + k);
            if(i == 0){
                smallest = str;
                largest = str;
            }
            else if(str.compareTo(smallest) < 0){
                smallest = str;
            }
            else if(str.compareTo(largest) > 0){
                largest = str;
            }
        }
        return smallest + "\n" + largest;
    }
}

        
        