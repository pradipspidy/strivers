//Buy and sell
// TC O(N)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] ={7, 1, 5, 3, 6, 4};
        int mn = arr[0], mx =0;
        int buyIndex = 0, sellIndex = 0;
        int minIndex = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int profit = arr[i] - mn;
            if(profit>mx){
                mx=profit;
                sellIndex =i;
                buyIndex=minIndex;
            }
            if(arr[i]<mn){
                mn = arr[i];
                minIndex=i;
            }
        }
       System.out.println("total profile is :: "+mx+" buy day::"+ buyIndex+" and sell day ::"+ sellIndex);
         }
}
