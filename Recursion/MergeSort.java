import java.util.Scanner;

public class MergeSort {

    public static int [] merge (int [] arr, int left, int mid, int right){

        int n1 =  mid - left +1;
        int n2 =  right -mid;
        
        // int left = 0;
        // int right =  n;

        // int mid  =  (left + right)/2;

        // merge(arr, n)
        return new int []{0};
        // while(left <= )
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []  arr = new int [n];

        for(int i=0;i< n;i++){
            arr[i] = sc.nextInt();
        }



    }

}