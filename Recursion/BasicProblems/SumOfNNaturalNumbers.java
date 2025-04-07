package BasicProblems;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

    static int SumOFNaturalNumbers(int n ){
        if ( n == 0) {
            return 0;
        }

        return n + SumOFNaturalNumbers(n- 1);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumOFNaturalNumbers(n));
    }
}
