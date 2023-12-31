// The Calendar class is an abstract class that provides methods for converting between a specific instant in time 
// and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, 
// such as getting the date of the next week.
// You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task,
// we have provided a portion of the code in the editor.
// For example, if you are given the date August 14th 2017, the method should return MONDAY as the day on that date.
//
// Input Format
// A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.
//
// Output Format
// Output the correct day in capital letters.
//
// Sample Input
// 08 05 2015
//
// Sample Output
// WEDNESDAY

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
         // Create a new calendar object since Date is deprecated. As such, so is the method
         // getDay() 
        Calendar cal = Calendar.getInstance();
        // set the date on the calendar. The month - 1 is used because the
        // Calendar class uses 0-based indexing for months, meaning January is 
        // represented by 0, February is represented by 1, and so on
        cal.set(year, month - 1, day);
        // use the Calendar.DAY_OF_WEEK constant instead of getDay(), which uses 
        //1-based indexing for the days of the week
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        // Initialize an empty string to hold the day name
        String dayName = "";
        // Use a switch case to determine the name of the day
        switch (dayOfWeek) {
            case 1:
                dayName = "SUNDAY";
                break;
            case 2:
                dayName = "MONDAY";
                break;
            case 3:
                dayName = "TUESDAY";
                break;
            case 4:
                dayName = "WEDNESDAY";
                break;
            case 5:
                dayName = "THURSDAY";
                break;
            case 6:
                dayName = "FRIDAY";
                break;
            case 7:
                dayName = "SATURDAY";
                break;
        }
        return dayName;
    }

