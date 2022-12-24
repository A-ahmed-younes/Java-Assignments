// Given a double-precision number,payment , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to 
// convert payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

// US: formattedPayment
// India: formattedPayment
// China: formattedPayment
// France: formattedPayment

// Sample Input

// 12324.134
// Sample Output

// US: $12,324.13
// India: Rs.12,324.13
// China: ￥12,324.13
// France: 12 324,13 €

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US); // Get the US currency format
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); // Get the India currency format
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA); // Get the China currency format
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE); // Get the France currency format

        String us1 = us.format(payment); // Format the payment amount in US currency
        String india1 = india.format(payment); // Format the payment amount in Indian currency
        String china1 = china.format(payment); // Format the payment amount in Chinese currency
        String france1 = france.format(payment); // Format the payment amount in French currency

        System.out.println("US: " + us1);
        System.out.println("India: " + india1);
        System.out.println("China: " + china1);
        System.out.println("France: " + france1);
    }
}


        

