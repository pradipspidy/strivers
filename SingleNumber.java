// Single Number - I
// TC O(N)
// SP WC::O(N)
import java.util.*;
class Main {
    public static void main(String[] args) {
         int arr[] = {1, 2, 2, 4, 3, 1, 4};
         HashMap<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             if(entry.getValue()==1){
                 System.out.println(entry.getKey());
        }
         }
    }
}
