package BasicProblems;

import java.util.Scanner;

public class FactorialOfNumber {

    static int FactorialofN(int n) {
        if( n <= 1) return 1;

        return n * FactorialofN(n -1);

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FactorialofN(n));
    }
}
