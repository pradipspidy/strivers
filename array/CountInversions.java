// Count Inversions
// Given an integer array nums. Return the number of inversions in the array.
// Two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// It indicates how close an array is to being sorted.
// A sorted array has an inversion count of 0.
// An array sorted in descending order has maximum inversion.

// Examples:
// Input: nums = [2, 3, 7, 1, 3, 5]

// Output: 5

// Explanation: The responsible indexes are:

// nums[0], nums[3], values: 2 > 1 & indexes: 0 < 3

// nums[1], nums[3], values: 3 > 1 & indexes: 1 < 3

// nums[2], nums[3], values: 7 > 1 & indexes: 2 < 3

// nums[2], nums[4], values: 7 > 3 & indexes: 2 < 4

// nums[2], nums[5], values: 7 > 5 & indexes: 2 < 5
// TC: O(NlogN)
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
            if (low<high){
                int mid = (high+low)/2;
                count += shorts(arr, low, mid);
                count += shorts(arr, mid+1, high);
                count += merge(arr, low, mid, high);
            }
            
            return count;
        }
         public static int merge (int[] arr, int low, int mid, int high){
            //   System.out.println("low::"+low+"high::"+high+"mid::"+mid);
             int count=0;
             int left=low;
             int right = mid+1;
             ArrayList<Integer> temp = new ArrayList<>();
             while(left<=mid && right<=high){
                 if (arr[left]<arr[right]){
                     temp.add(arr[left]);
                     left++;
                 }else{
                     count += (mid - left+1);
                    temp.add(arr[right]);
                    right++;
                 }
             }
             while(left<=mid){
                 temp.add(arr[left]);
                 left++;
             }
              while(right<=high){
                 temp.add(arr[right]);
                 right++;
             }
             for(int i=0; i<temp.size(); i++){
                 System.out.println(temp.get(i));
             }
            //  break;
            //  for(int i =low; i<=high; i++){
            //       arr[i] = temp.get(i - low);
            //  }
             
             return count;
         }
        
        
}
