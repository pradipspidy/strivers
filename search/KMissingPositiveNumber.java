// Kth Missing Positive Number
// Given a sorted array of unique positive integers arr, your task is to return the kᵗʰ missing positive number that is not present in arr.
// The array is guaranteed to be strictly increasing, and the missing numbers are those positive integers that do not appear in arr but would appear in a full sequence starting from 1.
// Examples:
// Input: arr = [3, 5, 7, 10], k = 6
// Output: 9
// Explanation:
// The missing numbers are [1, 2, 4, 6, 8, 9, 11, ...]. The 6ᵗʰ missing number is 9.
// Input: arr = [1, 4, 6, 8, 9], k = 3

// Output: 5

// Explanation:

// The missing numbers are [2, 3, 5, 7, 10, ...]. The 3ʳᵈ missing number is 5.


class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 9};
        int k = 3;

        int left = 0;
        int right = arr.length -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int missing = arr[mid] - (mid+1);

            if (missing < k) {
                // need bigger capacity
                left = mid + 1;
            } else {
                right = mid - 1; // try smaller capacity
            }
        }

        System.out.println(left+k);
    }
}
