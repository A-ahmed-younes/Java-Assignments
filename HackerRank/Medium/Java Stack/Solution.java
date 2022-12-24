// A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct,
//  AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

// Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

// Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

// Given a string, determine if it is balanced or not.

// Sample Input

// {}()
// ({()})
// {}(
// []
// Sample Output

// true
// true
// false
// true

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            Stack<Character> stack = new Stack<Character>();
            boolean isBalanced = true;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                } else {
                    char top = stack.pop();
                    if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
                        isBalanced = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                isBalanced = false;
            }
            System.out.println(isBalanced);

		}
    }
}

		