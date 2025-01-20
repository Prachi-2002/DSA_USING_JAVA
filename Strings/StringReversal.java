// package Strings;

import java.util.*;

public class StringReversal {

    public static String reverseString(String s){

       // Base case: if the string is empty or has only one character, return it
       if (s.length() <= 1) {
        return s;
    }
    // Recursive case: reverse the rest of the string and append the first character to the end
    return reverseString(s.substring(1)) + s.charAt(0);
    }
public static void main(String[] args) {
    String res = "Newton";

    System.out.println(reverseString(res));
}
    
}