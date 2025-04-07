package BasicProblems;

import java.util.Scanner;


// gcd(a, b) = gcd(b, a % b)
// This is the Euclidean Algorithm for finding the Greatest Common Divisor (GCD) of two numbers a and b.

public class GCDOfTwoNum {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD is: " + gcd(a, b));
    }
}
