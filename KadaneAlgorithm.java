//Kadane's Algorithm
// TC O(N)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] ={-5, 2, 3};
        int sm = 0, mx = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sm += arr[i];
            if (sm > mx) {
                mx = sm;
                start = tempStart; 
                end = i;
            }
            if (sm < 0) {
                sm = 0;
                tempStart = i + 1; 
            }
        }
         System.out.println(mx+" :: "+ start+"::"+end);
         }
}
