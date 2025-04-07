package DP;

import java.util.Arrays;

class DYP {
    static int[] dp;

    DYP() {
        this.dp = new int[1000];
        Arrays.fill(this.dp, -1);
        this.dp[0] = 0;
        this.dp[1] = 1;

    }

    int fibonacci(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    int fibonacciUsingMemoization(int n) {
        if (this.dp[n] != -1) {
            return dp[n];
        } else {
            this.dp[n] = fibonacciUsingMemoization(n - 1) + fibonacciUsingMemoization(n - 2);
            return dp[n];
        }
    }

    int fibonacciUsingTabulation(int n){
        
        int [] dp = new int[n];
        dp[0] = 0;
        dp[1]= 1;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    int ClimbStairs(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return ClimbStairs(n-1)+ ClimbStairs(n-2);
        }
    }

    int ClimbStairsUsingDp (int n){
        // int [] dp = new int [n];
        
        if(this.dp[n] != -1){
            return this.dp[n];
        }else{
            this.dp[n] = ClimbStairsUsingDp(n-1) + ClimbStairsUsingDp(n-2);
            return this.dp[n];
        }
    }
}

public class Fib {

    public static void main(String[] args) {

    }
}