#Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.
#Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.
#Note: You are not allowed to modify the original array.
#Examples:
#Input: nums = [3, 5, 4, 1, 1]
#Output: [1, 2]
#Explanation: 1 appears two times in the array and 2 is missing from nums
// Find The Repeating And Missing Number
// TC: O(N)
// SC: O(1) for result storage
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 1};
        int res[]={};
        int n = arr.length;
        int sn1 = (n*(n+1))/2;
        int sum = 0;
        int sn2 = (n *(n+1)*(2*n+1))/6;
        int sum2 =0;
        for(int i =0; i<n; i++){
            sum += arr[i];
            sum2 += arr[i] * arr[i];
        }
        int diff = sum-sn1;
        int temp = sum2-sn2;
        int tSum = temp/diff;
        int A = (diff + tSum)/2;
        int B = A - diff;
        System.out.println("Repeat::" + A +", Missing::"+B);
        
        
       
    }
}
