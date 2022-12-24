// You are given a class Solution and its main method in the editor. Your task is to create a class Prime.
//  The class Prime should contain a single method checkPrime.


// Input Format

// There are only five lines of input, each containing one integer.

// Output Format

// There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to checkPrime 
// in the main method of the class Solution. In case there is no prime number, then a blank line should be printed.

// Sample Input

// 2
// 1
// 3
// 4
// 5
// Sample Output

// 2 
// 2 
// 2 3 
// 2 3 5 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
// This allows you to use the in field of the System class without having to prefix it with the class name e.g. in instead of System.in
import static java.lang.System.in;

class Prime {
    public void checkPrime(int... numbers){
        for(int number : numbers){
            if(isPrime(number)){
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    
    private boolean isPrime(int number){
        if(number == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}

public class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}


        


