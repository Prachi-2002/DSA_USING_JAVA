import java.util.Scanner;

public class PrintNaturalNumbers {

    static void printNaturalNumbers(int n){
        if( n==1){
            System.out.print(n + " * ");
            return ;
        }

        printNaturalNumbers(n - 1);
        System.out.print(n + " * ");
    }

    static void recursivelyPrintNaturalNumbers(int n){
        if( n==1){
            System.out.print(n + " * ");
            return ;
        }

        System.out.print(n + " * ");
        recursivelyPrintNaturalNumbers(n - 1);
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // printNaturalNumbers(n);
        recursivelyPrintNaturalNumbers(n);
    }
}
