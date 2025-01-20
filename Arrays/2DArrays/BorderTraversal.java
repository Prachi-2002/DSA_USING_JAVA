import java.util.*;

public class BorderTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Traverse the top row
        for (int j = 0; j < m; j++) {
            System.out.print(arr[0][j] + " ");
        }

        // Traverse the right column (excluding the first element)
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i][m - 1] + " ");
        }

        // Traverse the bottom row (excluding the last element, in reverse)
        if (n > 1) { // Ensure there is more than one row
            for (int j = m - 2; j >= 0; j--) {
                System.out.print(arr[n - 1][j] + " ");
            }
        }

        // Traverse the left column (excluding the first and last elements, in reverse)
        if (m > 1) { // Ensure there is more than one column
            for (int i = n - 2; i > 0; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
