// Find the smallest divisor
// Given an array of integers nums and an integer limit as the threshold value, find the smallest positive integer divisor such that upon dividing all the elements of the array by this divisor, the sum of the division results is less than or equal to the threshold value.

// Each result of the division is rounded up to the nearest integer greater than or equal to that element.


// Examples:
// Input: nums = [1, 2, 3, 4, 5], limit = 8

// Output: 3

// Explanation: We can get a sum of 15(1 + 2 + 3 + 4 + 5) if we choose 1 as a divisor. 

// The sum is 9(1 + 1 + 2 + 2 + 3) if we choose 2 as a divisor. Upon dividing all the elements of the array by 3, we get 1,1,1,2,2 respectively. Now, their sum is equal to 7 <= 8 i.e. the threshold value. So, 3 is the minimum possible answer.

// Input: nums = [8,4,2,3], limit = 10

// Output: 2

// Explanation: If we choose 1, we get 17 as the sum. If we choose 2, we get 9 (4+2+1+2) <= 10 as the answer. So, 2 is the answer.

import java.lang.Math;
class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int left = findMin(arr);
        int right = findMax(arr);
        int res = -1;
        
        while(left <= right){
            int mid = (left+right)/2;
            int divisor =  findDivisor(arr, mid);
            // System.out.println(divisor);
            if(divisor > limit){
                 left = mid+1;
            }else{
                res = mid;
                right = mid-1;
            }
            
        }
        System.out.println(res);
    }
    public static int findDivisor(int[] arr, int min){
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            sum += (int)Math.ceil((double)arr[i]/min);

        }
        
        return sum;
        
    }
    public static int findMax(int[] arr){
        int mx = 0;
        for(int i=0; i< arr.length; i++){
            mx = Math.max(arr[i],mx);
        }
        return mx;
        
    }
    public static int findMin(int[] arr){
        int mn = arr[0];
        for(int i=0; i< arr.length; i++){
            mn = Math.min(arr[i],mn);
        }
        return mn;
        
    }
    
}
