// Merge two sorted arrays without extra space
// Given two integer arrays nums1 and nums2. Both arrays are sorted in non-decreasing order.
// Merge both the arrays into a single array sorted in non-decreasing order.

// The final sorted array should be stored inside the array nums1 and it should be done in-place.
// nums1 has a length of m + n, where the first m elements denote the elements of nums1 and rest are 0s.
// nums2 has a length of n.
// Examples:
// Input: nums1 = [-5, -2, 4, 5], nums2 = [-3, 1, 8]

// Output: [-5, -3, -2, 1, 4, 5, 8]

// Explanation: The merged array is: [-5, -3, -2, 1, 4, 5, 8], where [-5, -2, 4, 5] are from nums1 and [-3, 1, 8] are from nums2
// Count Inversions
// TC: O(N)
// SC: O(1) for result storage
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr1[] = {-5, -2, 4, 5};
        int arr2[] = {-3,1,8};
        int m = arr1.length;
        int n = arr2.length;
        int newArr[] = new int[m+n];

        // copy old arr1 into newArr
        for(int i=0; i<m; i++){
            newArr[i] = arr1[i];
        }
        
        // now newArr can hold both
        arr1 = newArr; //
        int left = m-1;
        int right = n-1;
        int target = m+n-1;
        while(left>=0 && right>=0){
            if(arr1[left]>arr2[right]){
                arr1[target] = arr1[left];
                left--;
            }else{
                 arr1[target] = arr2[right];
                right--;
            }
            target--;
        }
        while(right>=0){
            arr1[target] = arr2[right];
            right--;
            target--;
        }
        for(int i = 0; i<m+n; i++){
            System.out.println(arr1[i]);
        }
    }
}
