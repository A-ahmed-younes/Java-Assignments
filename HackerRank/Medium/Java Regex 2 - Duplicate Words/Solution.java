// In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once,
// but retain the first occurrence of any case-insensitive repeated word. For example, the words love and to are repeated 
// in the sentence I love Love to To tO code. Can you complete the code in the editor 
// so it will turn I love Love to To tO code into I love to code?
// To solve this challenge, complete the following three lines:
// Write a RegEx that will match any repeated word.
// Complete the second compile argument so that the compiled RegEx is case-insensitive.
// Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first
// instance the word found in the sentence. It must be the exact first occurrence of the word, as the expected output is case-sensitive.
// Note: This challenge uses a custom checker; you will fail the challenge if you modify anything other than the three
// locations that the comments direct you to complete. To restore the editor's original stub code, create a new buffer by clicking
// on the branch icon in the top left of the editor.
// Sample Input

// 5
// Goodbye bye bye world world world
// Sam went went to to to his business
// Reya is is the the best player in eye eye game
// in inthe
// Hello hello Ab aB
// Sample Output

// Goodbye bye world
// Sam went to his business
// Reya is the best player in eye game
// in inthe
// Hello Ab

//solution
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        
        // this regex matches any word that is repeated more than once in a sentence (case-insensitive) 
        // \\b is a word boundary which means that the word must be at the beginning or end of a string or be preceded or followed by a non-word character
        // \\w+ is a word character (a-z, A-Z, 0-9, _)
        // \\b\\W+\\b\\1\\b is a word boundary, a non-word character, a word boundary, the first captured group (\\w+), a word boundary

        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            // while there is a match, replace the matched string with the first group (\\w+)
            // this will remove all the words that are repeated more than once in a sentence
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}





