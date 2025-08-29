// Single element in sorted array
// Given an array nums sorted in non-decreasing order. Every number in the array except one appears twice. Find the single number in the array.
// Examples:
// Input :nums = [1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6]
// Output:4

// Explanation: Only the number 4 appears once in the array.
// Input : nums = [1, 1, 3, 5, 5]

// Ouput:3
// Explanation: Only the number 3 appears once in the array.
class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7};
        int n = arr.length;
        int left =0; 
        int right = n-1;
        while(left<right){
            int mid = (left+right)/2;
            if(mid % 2 == 1){
                mid--;
            }
            if(arr[mid] == arr[mid+1]){
                left = mid +2;
            }else{
                right=mid;
            }
        }
         System.out.println(arr[left]);
    }
    // int  rotation = left-0;
   
}
