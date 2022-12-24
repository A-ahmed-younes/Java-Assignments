// Write a class called MyRegex which will contain a string pattern.
// You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address.
// Use the following definition of an IP address:
// IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
// Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
// Some valid IP address:
// 000.12.12.034
// 121.234.12.12
// 23.45.12.56
// Some invalid IP address:
// 000.12.234.23.23
// 666.666.23.23
// .213.123.23.32
// 23.45.22.32.
// I.Am.not.an.ip
// Sample Input
// 000.12.12.034
// 121.234.12.12
// 23.45.12.56
// 00.12.123.123123.123
// 122.23
// Hello.IP
// Sample Output
// true
// true
// true
// false
// false
// false

mport java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
 // This code takes a string and checks whether it matches a pattern for IPv4 addresses.
 // It is used to check whether a string is a valid IPv4 address.
 // The pattern is in the form of a regular expression.
 // The 'matches' function is defined in the String class.
 // The string is passed to the function as an argument.
 

 String pattern = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
}

// or this solution

/* class MyRegex{
    private static final String PATTERN = "(\\d{1,2}|0\\d{1,2}|1\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = PATTERN + "." + PATTERN + "." + PATTERN + "." + PATTERN;
} */



