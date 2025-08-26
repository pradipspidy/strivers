//rotate array 1 postion left
// TC worst:: O(N) BEST:: O(N)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,9,1,6};
        int n = arr.length;
        int temp =arr[0];
        for(int i = 1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
         for(int i = 1; i<n; i++){
            System.out.println(arr[i]);
        }
        
    }
}
