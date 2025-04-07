package BasicProblems;

import java.util.Scanner;

public class PowerProblem {

    static int powerofATob(int a, int b){

        if ( b == 0) return 1;

        return a * powerofATob(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(powerofATob(a, b));
    }
}
