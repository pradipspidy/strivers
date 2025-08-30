// Book Allocation Problem


// 0

// 100
// Hard

// Given an array nums of n integers, where nums[i] represents the number of pages in the i-th book, and an integer m representing the number of students, allocate all the books to the students so that each student gets at least one book, each book is allocated to only one student, and the allocation is contiguous.



// Allocate the books to m students in such a way that the maximum number of pages assigned to a student is minimized. If the allocation of books is not possible, return -1.


// Examples:
// Input: nums = [12, 34, 67, 90], m=2

// Output: 113

// Explanation: The allocation of books will be 12, 34, 67 | 90. One student will get the first 3 books and the other will get the last one.

// Input: nums = [25, 46, 28, 49, 24], m=4

// Output: 71

// Explanation: The allocation of books will be 25, 46 | 28 | 49 | 24.
class Main {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int n =  arr.length;
        int m = 2;
        int res=0;

        int left = 0;
        int right = atSum(arr);
        while (left <= right) {
            int mid = (left + right) / 2;
            int numberOfStudent =1;
            int pages =0;
            for(int i=0; i<n; i++){
                if(arr[i]+pages>mid){
                    numberOfStudent++;
                    pages = arr[i];
                }else{
                   pages += arr[i];
                }
            }
            if(numberOfStudent<=m){
                res = mid;
                right = mid-1;
               
            }else{
                 left = mid+1;
            }
        }

        System.out.println(res);
    }
    public static int atSum(int[] arr){
        int sum =0;
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int atMax(int[] arr){
        int mx =0;
        for(int i =0; i<arr.length; i++){
            mx = Math.max(arr[i],mx);
        }
        return mx;
    }
}
