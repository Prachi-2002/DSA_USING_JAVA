package BasicProblems;

import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindrome (String s1, int n1, int n2){

        if(n1 >= n2){
            return true;
        }
        if(s1.charAt(n1) != s1.charAt(n2)){
            return false;
        }
        return isPalindrome(s1, n1+1, n2-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(isPalindrome(s, 0, s.length()-1));
    }
}
