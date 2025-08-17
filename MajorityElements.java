//Majority Elemets
// TC O(N)
// SP WC::O(N)
import java.util.*;
class Main {
    public static void main(String[] args) {
         int arr[] ={1, 1, 1, 2, 1, 2};
         int n = arr.length;
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0; i< n; i++){
             if(map.containsKey(arr[i])){
                 map.put(arr[i],map.get(arr[i])+1);
             }else{
                 map.put(arr[i],1);
             }
         }
         int mx = n/2;
         for(Map.Entry<Integer, Integer>entry : map.entrySet()){
             if(entry.getValue()>=mx){
                 System.out.println("Majority Elements is:: "+entry.getKey()+" WIth frequency "+entry.getValue());
                 break;
             }
         }
    }
}
