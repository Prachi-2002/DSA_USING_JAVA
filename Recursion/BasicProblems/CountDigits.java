package BasicProblems;

import java.util.Scanner;

public class CountDigits {

    static int countDigitsOfNum(int n){

        if(n == 0){
            return 1;
        }
        return 1+ countDigitsOfNum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigitsOfNum(n));
    
    }
}
