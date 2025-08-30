// Koko eating bananas
// --------------------
// A monkey is given n piles of bananas, where the 'ith' pile has nums[i] bananas. An integer h represents the total time in hours to eat all the bananas.

// Each hour, the monkey chooses a non-empty pile of bananas and eats k bananas. If the pile contains fewer than k bananas, the monkey eats all the bananas in that pile and does not consume any more bananas in that hour.

// Determine the minimum number of bananas the monkey must eat per hour to finish all the bananas within h hours.
// Examples:

// Input: n = 4, nums = [7, 15, 6, 3], h = 8

// Output: 5

// Explanation: If Koko eats 5 bananas/hr, he will take 2, 3, 2, and 1 hour to eat the piles accordingly. So, he will take 8 hours to complete all the piles.  
// ----------------------------------------
// Input: n = 5, nums = [25, 12, 8, 14, 19], h = 5

// Output: 25

// Explanation: If Koko eats 25 bananas/hr, he will take 1, 1, 1, 1, and 1 hour to eat the piles accordingly. So, he will take 5 hours to complete all the piles.
// TC = O(max+N)
// SC = O(1)
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        int[] arr = {7, 15, 6, 3};
        int left =1;
        int h =8;
        int right = findMax(arr);
        int res = right;
        while(left<=right){
            int mid = (left+right)/2;
            int totalH =  findK(arr, mid);
            if(totalH<h){
                right = mid-1;
                
            }else{
                left = mid+1;
            }
            
        }
        System.out.println(left);
    }
    public static int findK(int[] arr, int k){
        int totalHour = 0;
        for(int i=0; i< arr.length; i++){
            
            totalHour += Math.ceil(arr[i]/k);
            
        }
        return totalHour;
        
    }
    public static int findMax(int[] arr){
        int mx = 0;
        for(int i=0; i< arr.length; i++){
            mx = Math.max(arr[i],mx);
        }
        return mx;
        
    }
    
}
