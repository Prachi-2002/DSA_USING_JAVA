package Patterns;

import java.util.Scanner;

public class Patterns {

    static void oneZeroTriangle(int n){

    }

    static void leftHalfPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j)
        }
    }

    static void reverseLeftHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j >= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void reverseRightHalfPyramid(int n){
        for(int i = n;i>=1 ;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightHalfPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void numberChangingPyramid(int n){
        int count =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i ;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    static void squareFillPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void reverseRightAngleTriangle(int n) {
        for (int i = 0; i < n; i++) {

            // for(int j=0;j<=i-1;j++){
            // }

            for (int j = 0; j < n; j++) {

                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }

    static void HollowSquarePattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i== 0 || j== 0 || j == n-1 || i== n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void numberTriangular(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j< n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

    }


    static void numberIncreasingPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        
        for(int i=0;i<n/2;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i= (n/2 + 1); i <n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");   
            }
            System.out.println();
        }
    }

    static void numberIncreasingReversePyramid(int n){
        for(int i=n;i > 0; i--){
            for(int j=1; j<= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // rightHalfPyramid(n);
        // reverseRightAngleTriangle(n);
        // pattern1(n);
        // HollowSquarePattern(n);
        // numberTriangular(n);
        // numberIncreasingPyramid(n);
        // numberIncreasingReversePyramid(n);
        // numberChangingPyramid(n);\
        // squareFillPattern(n);
        // reverseRightHalfPyramid(n);
        leftHalfPyramid(n);
        // reverseLeftHalfPyramid(n);
    }
}