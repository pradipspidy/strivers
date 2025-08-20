// Spiral traversal of a matrix
// TC: O(N*M)
// SC: O(1)
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = arr.length;
        int m = arr[0].length;
        
        int top = 0, left = 0;
        int bottom = n - 1, right = m - 1;
        
        while (left <= right && top <= bottom) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            
            // Print right column
            for (int j = top; j <= bottom; j++) {
                System.out.print(arr[j][right] + " ");
            }
            right--;
            
            // Print bottom row (if still valid)
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    System.out.print(arr[bottom][k] + " ");
                }
                bottom--;
            }
            
            // Print left column (if still valid)
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    System.out.print(arr[l][left] + " ");
                }
                left++;
            }
        }
    }
}
