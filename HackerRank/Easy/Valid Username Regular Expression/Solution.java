// You are updating the username policy on your company's internal networking platform. According to the policy,
// a username is considered valid if all the following constraints are satisfied:
//
// The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters,
// then it is an invalid username.
// The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set
// consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
// The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or uppercase character [A-Z].
//
// Sample Input 

// 8
// Julia
// Samantha
// Samantha_21
// 1Samantha
// Samantha?10_2A
// JuliaZ007
// Julia@007
// _Julia007
// Sample Output 

// Invalid
// Valid
// Valid
// Invalid
// Invalid
// Valid
// Invalid
// Invalid

//solution
import java.util.Scanner;
class UsernameValidator {

    // ^ asserts position at start of the string (the beginning of the string) 
    // [a-zA-Z] matches a single character in the range between a (index 97) and z (index 122) (case sensitive)
    // [a-zA-Z0-9_] matches a single character in the range between a (index 97) and z (index 122) (case sensitive), between 0 (index 48) and 9 (index 57) (case sensitive), and _ (index 95) (case sensitive)
    // {7,29} matches the previous token between 7 and 29 times, as many times as possible, giving back as needed (greedy)
    // $ asserts position at the end of the string (the end of the string)

    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    
}
