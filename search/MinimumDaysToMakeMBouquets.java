// Minimum days to make M bouquets
// Given n roses and an array nums where nums[i] denotes that the 'ith' rose will bloom on the nums[i]th day, only adjacent bloomed roses can be picked to make a bouquet. Exactly k adjacent bloomed roses are required to make a single bouquet. Find the minimum number of days required to make at least m bouquets, each containing k roses. Return -1 if it is not possible.
// Examples:
// Input: n = 8, nums = [7, 7, 7, 7, 13, 11, 12, 7], m = 2, k = 3

// Output: 12

// Explanation: On the 12th the first 4 flowers and the last 3 flowers would have already bloomed. So, we can easily make 2 bouquets, one with the first 3 and another with the last 3 flowers.


import java.lang.Math;
class Main {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int left = findMin(arr);
        int k = 3;
        int m=2;
        int right = findMax(arr);
        int res = right;
        if (m*k > arr.length){
            System.out.println(-1);
        }
        while(left <= right){
            int mid = (left+right)/2;
            int bouquets =  findBloomed(arr, mid,k, m);
            if(bouquets < m){
                 left = mid+1;
            }else{
                right = mid-1;
            }
            
        }
        System.out.println(left);
    }
    public static int findBloomed(int[] arr, int days,int k, int m){
        int active = 0;
        int bl = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i]<=days){
                active++;
            }else{
                bl += active/k;
                active =0;
            }
            
        }
         bl += active/k;
        return bl;
        
    }
    public static int findMax(int[] arr){
        int mx = 0;
        for(int i=0; i< arr.length; i++){
            mx = Math.max(arr[i],mx);
        }
        return mx;
        
    }
    public static int findMin(int[] arr){
        int mn = 0;
        for(int i=0; i< arr.length; i++){
            mn = Math.min(arr[i],mn);
        }
        return mn;
        
    }
    
}
