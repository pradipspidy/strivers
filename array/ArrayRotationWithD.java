//rotate array D postion left
// TC worst:: O(N)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,9,1,6};
        int d = 3;
        int n = arr.length;
        int left = 0;
        int right = n-1;
        Swift(arr, left, d-1);
        Swift(arr, d, right);
        Swift(arr, left, right);
        for(int i = 0; i<n; i++){
           System.out.println(arr[i]);
        }
    }
    public static void Swift(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
