package copilot;

import java.util.ArrayList;
import java.util.List;

/**
 * #String Manipulation
 * Method to reverse a string using StringBuilder
 * Method to reverse a string using recursion
 * Method to count a word in a string
 * Method to sort a string alphabetically
 * Method to sort String array alphabetically
 * 
 * How to Read Excel File in Java using Apache POI  
 * Create a list and iterate over it
 */
public class JavaExamples {

    //Add two numbers
    public int add(int a, int b) {
        return a + b;
    }
    
    //Method to find remainder for two numbers
    public int remainder(int a, int b) {
        return a % b;
    }
    
    //Method to compare two strings
    public boolean compare(String a, String b) {
        return a.equals(b);
    }
    
    //Sort string alphabetically
    public String sort(String a) {
        char[] chars = a.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
    
    
    //Method to sort a string alphabetically
    public String sortString(String a) {
        char[] chars = a.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
   
    //string into uppercase 
    public String upper(String a) {
        return a.toUpperCase();
    }
    
    
}
