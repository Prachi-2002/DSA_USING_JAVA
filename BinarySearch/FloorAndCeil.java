public class FloorAndCeil {

    public static int findCeil (int [] arr, int target){

        int low =0;
        int high =  arr.length -1;
        int ans = -1;
        while(low <= high){

            int mid  = (low + high)/2;

            if(arr[mid] >= target){
                ans = mid;
                high = mid -1;

            }else{
                low = mid  +1;

            }

            
            
        }
        return ans;
    }

    static int findFloor(int [] arr, int target){

        int low =0;
        int high = arr.length -1;
        int ans  = -1;
        while(low <= high){
            int mid  =(low + high)/2;

            if(arr[mid] <= target){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        
        int arr [] = {2,3,4,5,6,9};
         int target = 7;

        System.out.println(findCeil(arr, target));
        System.out.println(findFloor(arr, target));
    }
}