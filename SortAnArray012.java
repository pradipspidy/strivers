//Sort an array of 0's 1's and 2's
// TC O(N)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
         int arr[] ={1, 0, 2, 1, 0};
         int start = 0;
         int mid = 0;
         int end = arr.length-1;
         while(mid<=end){
             if(arr[mid]==0){
                 int temp = arr[start];
                 arr[start] = arr[mid];
                 arr[mid] = temp;
                 start++;
                 mid++;
             }
            else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[end];
                 arr[end] = arr[mid];
                 arr[mid] = temp;
                 end--;
            }
         }
         for (int i = 0; i< arr.length; i++){
           System.out.println(arr[i]);
         }
             
             
    }
}
