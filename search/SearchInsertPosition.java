// Search insert position
// Given a sorted array of nums consisting of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// Examples:
// Input: nums = [1, 3, 5, 6], target = 5
// Output: 2
// Explanation: The target value 5 is found at index 2 in the sorted array. Hence, the function returns 2.

//TC = O(log n)
//SC = O(1)
class Main {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int n = arr.length;
        int target = 4;
        int low = 0; 
        int high = n-1;
        int res =-1 ;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]==target){
                // res = mid;
                 System.out.println("unique item in array "+mid);
               return;
            }else if (arr[mid]>target){
                high = mid-1;
            }else if(arr[mid]<target){
                low = mid+1;
            }
            
            
        }
        
        System.out.println("unique item in array "+low);
    }
}
