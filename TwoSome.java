//Two some
// TC O(N)
// SP WC::O(N)
import java.util.*;
class Main {
    public static void main(String[] args) {
         int arr[] ={1, 3, 5, -7, 6, -3};
         int totel = 0;
         HashMap<Integer, Integer> map = new HashMap<>();
         for (int i=0; i<arr.length; i++){
             int remain = totel - arr[i];
             if(map.containsKey(remain)){
                 System.out.println(map.get(remain)+","+i);
                 break;
             }
         map.put(arr[i],i);
             
         }
    }
}
