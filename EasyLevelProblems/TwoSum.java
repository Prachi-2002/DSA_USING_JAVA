package EasyLevelProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    
    static int[] findTwoSum (int[]arr, int n, int target){
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i< n;i++){
            if(map.containsKey(target - arr[i])){
                return  new int []{map.get(target - arr[i]) + 1, i+1};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        
        int [] arr = new int [n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(Arrays.toString(findTwoSum(arr, n, target)));

    }
}
