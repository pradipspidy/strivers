// Given an integer array nums. Return the number of reverse pairs in the array.
// An index pair (i, j) is called a reverse pair if:
// 0 <= i < j < nums.length
// nums[i] > 2 * nums[j]
// Examples:
// Input: nums = [6, 4, 1, 2, 7]
// Output: 3
// Explanation: The reverse pairs are:

// (0, 2) : nums[0] = 6, nums[2] = 1, 6 > 2 * 1

// (0, 3) : nums[0] = 6, nums[3] = 2, 6 > 2 * 2

// (1, 2) : nums[1] = 4, nums[2] = 1, 4 > 2 * 1

// Count Inversions
// TC: O(N)
// SC: O(1) for result storage
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {6, 4, 1, 2, 7};
        int n = arr.length;
        int left =0; 
        int right =n-1;
        int count = shorts(arr, left, right);
        System.out.println(count);
        }
        public static int shorts (int[] arr, int low, int high){
            int count = 0;
            int pair = 0;
            if (low<high){
                int mid = (high+low)/2;
                count += shorts(arr, low, mid);
                count += shorts(arr, mid+1, high);
                pair += pair(arr, low, mid, high);
            }
            
            return pair;
        }
        
          public static int pair (int[] arr, int low, int mid, int high){
               int pair = 0;
             int count=0;
             int right = mid+1;
             for(int i=low; i<=mid; i++){
                 
                 while (right<=high && arr[i] > 2* arr[right]){
                     right++;
                 }
                pair += right - (mid+1);
             }
             return pair;
         }
        
        
}


