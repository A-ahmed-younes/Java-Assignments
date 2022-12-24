// Let's play a game on an array! You're standing at index 0 of an n-element array named game. From some index i (where 0 <= i < n),
// you can perform one of the following moves:
//
// Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.
// Move Forward:
// If cell i+1 contains a zero, you can walk to cell i+1.
// If cell i+2 contains a zero, you can jump to cell i+2.
// If you're standing in cell n-1 or the value of i+1 or i+2 is greater than n-1, you can walk or jump off the end of the array and win the game.
//
// In other words, you can move from index i to index i+1, i+2, i-1 as long as the destination index is a cell containing a 0. If the destination index is greater than n-1, you win the game.
//
// Given game, an array of n integers, where each game[i] denotes the value of the cell at index i, determine if you can win the game.
//
// For example, given the array game = [0,0,0,0,0,1,0], indexed from 0...6, you can win because:
// Move Forward to cell 1, because game[1] = 0.
// Move Forward to cell 2, because game[2] = 0.
// Move Backward to cell 1, because game[1] = 0.
// Move Forward to cell 2, because game[2] = 0.
// Move Forward to cell 3, because game[3] = 0.
// Move Forward to cell 4, because game[4] = 0.
// Move Backward to cell 3, because game[3] = 0.
// Move Forward to cell 4, because game[4] = 0.
// Move Forward to cell 5, because game[5] = 1.
// You have now reached the end of the array and won the game.

// Solution

import java.util.*;

public class Solution {

    private static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // Check if we have won the game
        if (i < 0 || game[i] == 1) {
            return false;
        } else if (i + 1 >= game.length || i + leap >= game.length) {
            return true;
        }
        // marks as visited
        game[i] = 1; 

        // Recursive Cases
        return isSolvable(leap, game, i + leap) || isSolvable(leap, game, i + 1) || isSolvable(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

