Split array - largest sum
Hard

Given an integer array a of size n and an integer k. Split the array a into k non-empty subarrays such that the largest sum of any subarray is minimized. Return the minimized largest sum of the split.


Examples:
Input: a = [1, 2, 3, 4, 5], k = 3

Output:6

Explanation: There are many ways to split the array a[] into k consecutive subarrays. The best way to do this is to split the array a[] into [1, 2, 3], [4], and [5], where the largest sum among the three subarrays is only 6.

Input: a = [3,5,1], k = 3

Output: 5

Explanation: There is only one way to split the array a[] into 3 subarrays, i.e., [3], [5], and [1]. The largest sum among these subarrays is 5.
class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(splitArray(a, k)); // Output: 6
    }

    public static int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);   // at least the largest element
            right += num;                 // at most total sum
        }

        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
             System.out.println("left::"+left+" right::"+right+" mid::"+ mid);
            if (canSplit(nums, k, mid)) {
                ans = mid;        // valid split, try smaller max
                right = mid - 1;
            } else {
                left = mid + 1;   // too small, increase limit
            }
        }
        return ans;
    }

    // Check if we can split into <= k subarrays with max sum <= limit
    public static boolean canSplit(int[] nums, int k, int limit) {
        int count = 1, sum = 0;
        for (int num : nums) {
            if (sum + num > limit) {
                count++;    // start new subarray
                sum = num;
                if (count > k) return false;
            } else {
                sum += num;
            }
        }
        return true;
    }
}

