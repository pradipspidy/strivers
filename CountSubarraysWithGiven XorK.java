#Count subarrays with given xor K
#Given an array of integers nums and an integer k, return the total number of subarrays whose XOR equals to k.
#Examples:
#Input : nums = [4, 2, 2, 6, 4], k = 6
#Output : 4
#Explanation : The subarrays having XOR of their elements as 6 are [4, 2],  [4, 2, 2, 6, 4], [2, 2, 6], and [6]
// TC: O(N)
// SC: O(N) for result storage
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        int n = arr.length;
        int target =6;
        int xor =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen =0;
        for (int i = 0; i < n; i++) {
           xor ^=arr[i];
           if (xor==target){
               maxLen++;
           }
           int required = xor ^ target;
            if (map.containsKey(required)) {
                maxLen += map.get(required);
            } 
           if(map.containsKey(xor)){
               map.put(xor, map.get(xor)+1);
           }else{
               map.put(xor, 1);
           }
        }
        System.out.println(maxLen);
    }
}

