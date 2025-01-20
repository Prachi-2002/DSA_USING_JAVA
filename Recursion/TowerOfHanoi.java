import java.util.Scanner;

public class TowerOfHanoi {


    public static int numberOfSteps(int n){

        if(n == 1){
            return 1;
        }
        return 2 * numberOfSteps(n-1) + 1;
    }

    public static int findMinimum(int [] arr, int n){

        if( n == 1)
            return arr[0];

        return Math.min(arr[n-1], findMinimum(arr, n-1));
    }

    public static int findMaximum(int [] arr, int n){

        if( n == 1)
            return arr[0];

        return Math.max(arr[n-1], findMaximum(arr, n-1));
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(numberOfSteps(n));


    }
}