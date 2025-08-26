//Maximum Consecutive Ones
// TC O(n)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
         int arr[] = {1, 1, 0, 0, 1, 1, 1, 1};
         int mx =0;
         int sum = 0;
         for (int i = 0; i<arr.length; i++){
             if(arr[i]!=0)
             {
                 sum +=1;
             }else{
                mx = Math.max(mx,sum);
                sum=0;
             }
         }
         mx = Math.max(mx, sum);
         System.out.println("missingNumber:: "+ mx);
    }
    
}
