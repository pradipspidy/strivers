// Capacity to Ship Packages Within D Days
// You are given an array weights where weights[i] represents the weight of the i-th package on a conveyor belt. All the packages must be shipped in the order given from one port to another within days days.

// Each day, the ship can carry a contiguous sequence of packages, as long as the total weight does not exceed its maximum capacity.
// Your task is to find the minimum possible capacity of the ship so that all packages can be shipped within the given number of days.
// Examples:
// Input: weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], days = 5

// Output: 15

// Explanation:

// Minimum ship capacity = 15. One way to ship in 5 days:

// Day 1: 1 + 2 + 3 + 4 + 5 = 15
// Day 2: 6 + 7 = 13
// Day 3: 8
// Day 4: 9
// Day 5: 10


// No day exceeds capacity 15 and all packages are shipped in order in 5 days.


class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 4, 1, 4};
        int days = 3;

        int left = findMax(arr);   // minimum possible capacity
        int right = findSum(arr);  // maximum possible capacity
        int res = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int nDays = findDays(arr, mid);

            if (nDays > days) {
                // need bigger capacity
                left = mid + 1;
            } else {
                // possible answer
                res = mid;
                right = mid - 1; // try smaller capacity
            }
        }

        System.out.println(res);
    }

    // Calculate how many days are needed if capacity = limit
    public static int findDays(int[] arr, int limit) {
        int days = 1;  // at least 1 day
        int wgt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (wgt + arr[i] > limit) {
                days++;      // need new day
                wgt = 0;     // reset load
            }
            wgt += arr[i];
        }

        return days;
    }

    public static int findMax(int[] arr) {
        int mx = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mx = Math.max(arr[i], mx);
        }
        return mx;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
