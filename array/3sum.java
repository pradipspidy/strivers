// 3Sum Problem
// TC: O(N^2)
// SC: O(N) for result storage
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {2, -2, 0, 3, -3, 5};
        int n = arr.length;
        Arrays.sort(arr);

        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        // Printing results
        for (List<Integer> triplet : res) {
            System.out.println(triplet);
        }
    }
}
