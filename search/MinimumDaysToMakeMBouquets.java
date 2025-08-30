// Minimum days to make M bouquets
// Given n roses and an array nums where nums[i] denotes that the 'ith' rose will bloom on the nums[i]th day, only adjacent bloomed roses can be picked to make a bouquet. Exactly k adjacent bloomed roses are required to make a single bouquet. Find the minimum number of days required to make at least m bouquets, each containing k roses. Return -1 if it is not possible.
// Examples:
// Input: n = 8, nums = [7, 7, 7, 7, 13, 11, 12, 7], m = 2, k = 3

// Output: 12

// Explanation: On the 12th the first 4 flowers and the last 3 flowers would have already bloomed. So, we can easily make 2 bouquets, one with the first 3 and another with the last 3 flowers.


class Main {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;

        // Impossible case
        if (m * k > arr.length) {
            System.out.println(-1);
            return;
        }

        int left = findMin(arr);
        int right = findMax(arr);
        int res = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int bouquets = findBloomed(arr, mid, k);

            if (bouquets < m) {
                left = mid + 1;
            } else {
                res = mid;       // candidate answer
                right = mid - 1; // try smaller day
            }
        }

        System.out.println(res);
    }

    public static int findBloomed(int[] arr, int days, int k) {
        int active = 0;
        int bouquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                active++;
                if (active == k) {
                    bouquets++;
                    active = 0;
                }
            } else {
                active = 0; // reset if flower not bloomed
            }
        }
        return bouquets;
    }

    public static int findMax(int[] arr) {
        int mx = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mx = Math.max(arr[i], mx);
        }
        return mx;
    }

    public static int findMin(int[] arr) {
        int mn = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mn = Math.min(arr[i], mn);
        }
        return mn;
    }
}

    
}
