// Given an array arr of integers. A peak element is defined as an element greater than both of its neighbors.

// Formally, if arr[i] is the peak element, arr[i - 1] < arr[i] and arr[i + 1] < arr[i].



// Find the index(0-based) of a peak element in the array. If there are multiple peak numbers, return the index of any peak number.



// Note:

// As there can be many peak values, 1 is given as output if the returned index is a peak number, otherwise 0.

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak must be on the right side
                left = mid + 1;
            } else {
                // Peak must be on the left side (or at mid)
                right = mid;
            }
        }

        // left == right is the peak index
        System.out.println("Peak found at index: " + left + " with value: " + arr[left]);
    }
}
