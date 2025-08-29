
// First and last occurrence
// Easy

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value. If the target is not found in the array, return [-1, -1].

// Examples:
// Input: nums = [5, 7, 7, 8, 8, 10], target = 8

// Output: [3, 4]

// Explanation:The target is 8, and it appears in the array at indices 3 and 4, so the output is [3,4]

// Input: nums = [5, 7, 7, 8, 8, 10], target = 6

// Output: [-1, -1]

// Expalantion: The target is 6, which is not present in the array. Therefore, the output is [-1, -1].

// TC = O(n)
//SC = O(1)
class Main {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int n = arr.length;
        int target =8;
        int first = -1;
        int last = 0; 
        for(int i=0; i<n;i++){
            if(arr[i]==target){
                if(first<0){
                    first = i;
                }else{
                    last =i;
                }
            }
        }
        if(first<0){
            System.out.println("-1,-1");
        }else if(first>0 && last ==0){
            System.out.println(first+","+first);
        }else{
             System.out.println(first+","+last);
        }
        
    }
}
