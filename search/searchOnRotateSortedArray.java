// Given an integer array nums, sorted in ascending order (with distinct values) and a target value k. The array is rotated at some pivot point that is unknown. Find the index at which k is present and if k is not present return -1.

// Examples:
// Input : nums = [4, 5, 6, 7, 0, 1, 2], k = 0

// Output: 4

// Explanation: Here, the target is 0. We can see that 0 is present in the given rotated sorted array, nums. Thus, we get output as 4, which is the index at which 0 is present in the array.

// Input: nums = [4, 5, 6, 7, 0, 1, 2], k = 3

// Output: -1

// Explanation: Here, the target is 3. Since 3 is not present in the given rotated sorted array. Thus, we get the output as -1.

// TC = O(n)
//SC = O(1)
class Main {
    public static void main(String[] args) {
        int[] arr = {7,8,9,0,1,2,3,4,5,6};
        int n = arr.length;
        int target =0;
        int left =0;
        int right =n-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target < arr[mid]){
               right = mid-1;
            }else{
                 left =mid+1;
            }
            }else{
             if(arr[mid] < target && target <= arr[right]){
                left =mid+1;
            }else{
                right = mid-1;
            }   
            }
        }
         System.out.println(-1);
    }
}
