// Find Nth root of a number
// Medium
// Given two numbers N and M, find the Nth root of M. The Nth root of a number M is defined as a number X such that when X is raised to the power of N, it equals M. If the Nth root is not an integer, return -1.
// Examples:
// Input: N = 3, M = 27

// Output: 3

// Explanation: The cube root of 27 is equal to 3.

// Input: N = 4, M = 69

// Output:-1

// Explanation: The 4th root of 69 does not exist. So, the answer is -1.

class Main {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int n = 27;
        int left = 0;
        int sub =3;
        int right = n;

        while (left <= right) {
            int mid = (left + right) / 2;
            int power=1;
             for (int i = 0; i < sub; i++) {
                power *= mid;
                if (power > n) break; // prevent overflow
            }
            if(power==n){
                System.out.println(mid);
                return;
            }
            if(power<n){
                left =mid +1;
            }else{
                right = mid -1;
            }
            
        }
         System.out.println(-1);
    }
}
