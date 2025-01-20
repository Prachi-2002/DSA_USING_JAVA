public class FirstAndLastOccurence {

    static int firstOccurence (int []arr, int target){
        int low =0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid  = (low + high)/2;

            if( arr[mid] == target){
                ans  = mid;
                high = mid -1;
            }else if( arr[mid] < target) {
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;

    }

    static int lastOccurence (int [] arr, int target){

        int low =0;
        int high = arr.length -1;
        int ans = -1;
        while(low <= high){
            int mid  =(low + high )/2;

            if(arr[mid] == target){
                ans = mid;
                low = mid +1;
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int [] arr = {1,2,4,5,6,7,8,8,8,8,9};
        int target = 8;
        System.out.println("First Occurence" + firstOccurence(arr, target));
        System.out.println("Last Occurence" + lastOccurence(arr, target));



    }
}