//Union of two sorted arrays
// TC O(n+m)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
         int nums1[] = {1, 2, 3, 4, 5};
         int nums2[] = {1, 2, 7};
         int i=0 ,j = 0;
         List<Integer> arr = new ArrayList<>();
         while(i < nums1.length && j < nums2.length){
             if(nums1[i]<= nums2[j]){
                 uniqueList(arr, nums1[i]);
                 i++;
             }else{
                 uniqueList(arr, nums2[j]);
                 j++;
             }
         }
         while(i<nums1.length){
             uniqueList(arr, nums1[i]);
             i++;
         }
         while(j<nums2.length){
             uniqueList(arr, nums2[j]);
             j++;
         }
         for(int item:arr){
              System.out.println(item);
         }
    }
    public static void uniqueList(List<Integer> arr, int value){
        if(arr.isEmpty() || (arr.get(arr.size()-1)!=value)){
            arr.add(value);
        }
    }
    
}
