package BasicProblems;

import java.util.Scanner;

public class ReverseNumber {

    static int reverse(int n, int reverse){
        if( n == 0) return reverse;
        return reverse(n/10, n % 10  + reverse * 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(reverse(n, 0));

    }
}
