// Find minimum in Rotated Sorted Array
// Given an integer array nums of size N, sorted in ascending order with distinct values, and then rotated an unknown number of times (between 1 and N), find the minimum element in the array.


// Examples:
// Input : nums = [4, 5, 6, 7, 0, 1, 2, 3]

// Output: 0

// Explanation: Here, the element 0 is the minimum element in the array.

// Input : nums = [3, 4, 5, 1, 2]

// Output: 1

// Explanation:Here, the element 1 is the minimum element in the array.
class Main {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // If mid element is greater than rightmost, min is in right half
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                // Otherwise, min is in left half (including mid)
                high = mid;
            }
        }
        // low == high -> minimum element
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int[] nums2 = {3,4,5,1,2};
        System.out.println(findMin(nums1)); // 0
        System.out.println(findMin(nums2)); // 1
    }
}
