//Longest Sub Array
// TC O(N)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
         int arr[] = {-3, 2, 1};
         int target = 15;
         int lg = 0;
         int sum = 0;
         int start = 0;
         int sl = 0;
         for (int i = 0; i < arr.length; i++) {
           if(arr[i]>0){
                sum += arr[i];
               if(sum<target){
                   sl++;
               }else{
                   lg = Math.max(lg,sl);
                   sum = sum - arr[start];
                   start++;
               }
           }else{
               lg = Math.max(lg,sl);
               sum = sum - arr[start];
               start++;
               sl--;
           }
           
        }
        lg = Math.max(lg,sl);
        System.out.println(lg);
    }
}
