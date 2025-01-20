public class SearchInsertedPosition {

    public static void main(String[] args) {
        // Similar to finding lowerBound

        int [] arr = {2, 5,6,8,9};
        int target = 4;

        int low =0;
        int high = arr.length -1;
        int ans = arr.length;
        while(low<= high){
            int mid = (low + high )/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        }
        System.out.println(ans + "Index of element");
    }
}