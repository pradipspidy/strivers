// Longest Consecutive Sequence in an Array
// TC O(N)
// SP WC::O(N)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        Set<Integer> resSet = new HashSet<>();
        int n = arr.length;
        int lg = 0;
        for (int i = 0; i<n; i++){
            resSet.add(arr[i]);
        }
        for(int value:resSet){
            if(!resSet.contains(value-1)){
                int curr = value;
                int len = 1;
                while(resSet.contains(curr+1)){
                    curr++;
                    len++;
                }
                lg = Math.max(lg,len);
            }
        }
       System.out.println(lg);
    }
 }
