// Upper Bound
// Easy
// Given a sorted array of nums and an integer x, write a program to find the upper bound of x.
// The upper bound algorithm finds the first and smallest index in a sorted array where the value at that index is greater than a given key i.e. x.
// If no such index is found, return the size of the array.
// Examples:
// Input : n= 4, nums = [1,2,2,3], x = 2
// Output:3
// Explanation:
// Index 3 is the smallest index such that arr[3] > x.
// //TC = O(log n)
// //SC = O(1)
class Main {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int n = arr.length;
        int target = 3;
        int low = 0; 
        int high = n-1;
        int res =n ;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]>target){
                res = mid;
                high = mid-1;
           }else{
                low = mid+1;
            }
        }
        System.out.println("unique item in array "+res);
    }
}
