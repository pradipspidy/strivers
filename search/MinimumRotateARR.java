// Find minimum in Rotated Sorted Array
// Given an integer array nums of size N, sorted in ascending order with distinct values, and then rotated an unknown number of times (between 1 and N), find the minimum element in the array.


// Examples:
// Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]

// Output: 0

// Explanation: Here, the element 0 is the minimum element in the array.

// Input : nums = [3, 4, 5, 1, 2]

// Output: 1

// Explanation:Here, the element 1 is the minimum element in the array.
class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int n = arr.length;
        int left =0; 
        int right = n-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid] < arr[right]){
                right = mid;
            }else{
                left = mid+1;
            }
        }
         System.out.println(left);
    }
    // int  rotation = left-0;
   
}
