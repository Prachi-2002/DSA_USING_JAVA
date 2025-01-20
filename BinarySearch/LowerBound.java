public class LowerBound {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6};

        // element which is just greater than or equal is called as lowerBound
        // return the index of such element

        int target = 5;
        int low = 0;
        int high = arr.length - 1;
        int ans = -1; // Default value if no element satisfies the condition
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevent integer overflow
            if (arr[mid] >= target) {
                ans = mid; // Update answer
                high = mid - 1; // Continue searching in the left half
            } else {
                low = mid + 1; // Move to the right half
            }
        }

        System.out.println("Lower Bound Index: " + ans);
    }
}
