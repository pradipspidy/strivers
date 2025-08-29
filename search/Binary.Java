// Search X in sorted array
// Given a sorted array of integers nums with 0-based indexing, find the index of a specified target integer. If the target is found in the array, return its index. If the target is not found, return -1.
// Examples:
// Input: nums = [-1,0,3,5,9,12], target = 9

// Output: 4

// Explanation: The target integer 9 exists in nums and its index is 4

class Main {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int n = arr.length;
        int target = 9;
        int low = 0; 
        int high = n-1;
        int res =-1 ;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]==target){
                res = mid;
                break;
            }else if (arr[mid]>target){
                high = mid-1;
            }else if(arr[mid]<target){
                low = mid+1;
            }
        }
        System.out.println("unique item in array "+res);
    }
}
