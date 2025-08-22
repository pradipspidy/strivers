#Largest Subarray with Sum 0
#You are given an integer array arr of size n which contains both positive and negative integers. Your task is to find the length of the longest contiguous subarray with sum equal to 0.
#Return the length of such a subarray. If no such subarray exists, return 0.

#Examples:

#Input: arr = [15, -2, 2, -8, 1, 7, 10, 23]
#Output: 5

#Explanation:
#The subarray [-2, 2, -8, 1, 7] sums up to 0 and has the maximum length among all such subarrays.
// 3Sum Problem
// TC: O(N)
// SC: O(N) for result storage
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {2, 10, 4};
        int n = arr.length;
        int sum =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen =0;
        for (int i = 0; i < n; i++) {
           sum +=arr[i];
           if (sum==0){
               maxLen = i+1;
           }
           if(map.containsKey(sum)){
               maxLen = Math.max(maxLen,i-map.get(sum));
           }else{
               map.put(sum, i);
           }
        }
        System.out.println(maxLen);
    }
}

