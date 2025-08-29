// Find square root of a number
// Given a positive integer n. Find and return its square root. If n is not a perfect square, then return the floor value of sqrt(n).
// Examples:
// Input: n = 36

// Output: 6

// Explanation: 6 is the square root of 36.

// Input: n = 28

// Output: 5

// Explanation: The square root of 28 is approximately 5.292. So, the floor value will be 5.

class Main {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int n = 40;
        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(mid*mid == n){
                System.out.println(mid);
                return;
            }
            if(mid*mid<n){
                left =mid +1;
            }else{
                right = mid -1;
            }
            
        }
         System.out.println(left-1);
    }
}
