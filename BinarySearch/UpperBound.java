public class UpperBound {

    public static void main(String[] args) {
        
        int [] arr = {1, 4,5,6,7,9};
        int target = 0;

        int low =0;
        int high = arr.length -1;
        int ans = arr.length;
        while(low <= high){
            int mid = (low+ high)/2;

            if(arr[mid] > target){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }

        System.out.println("Upper Bound will be"+ ans);
    }
}