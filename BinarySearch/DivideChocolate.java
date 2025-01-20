import java.util.*;

class DivideChocolate {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] chocolate = new int [n];

        for(int i=0;i<n;i++){
            chocolate[i] = sc.nextInt();
        }

        int maxMinSweetnees = Integer.MIN_VALUE;
        // Try every possible sum threshold (1 to sum of all chocolates)
        int totalSum = Arrays.stream(chocolate).sum();

        for(int splitCount=1;splitCount<= totalSum;splitCount++){
            int minSweetnees = Integer.MAX_VALUE;
            int currentSum =0;
            int partitions = 1;

            for(int j=0;j<n;j++){

                currentSum += chocolate[j];

                if(currentSum >= splitCount){
                    minSweetnees = Math.min(currentSum, minSweetnees);
                    partitions++;
                    currentSum = 0;
                }

            }
            
            if( partitions >=k+1 ) break;
            maxMinSweetnees = Math.max(minSweetnees, maxMinSweetnees);

        }

        System.out.print(maxMinSweetnees);
        // return maxMinSweetnees;
    }
    
}