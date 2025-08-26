// Majority Element-II
// TC: O(N)
// SC: O(N)
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 1, 3, 2, 2};
        int n = arr.length;
        HashMap<Integer,Integer> res = new  HashMap<>();
         List<Integer> rslt = new ArrayList<>();
       for(int i =0;i<n;i++){
           if(res.containsKey(arr[i])){
              res.put(arr[i],res.get(arr[i])+1);
           }else{
               res.put(arr[i],1);
           }
       }
       for(Map.Entry<Integer, Integer> entry : res.entrySet()){
           if(entry.getValue()>n/3){
               rslt.add(entry.getKey());
           }
       }
       for(int k=0;k<rslt.size(); k++){
           System.out.println(rslt.get(k));
       }
    }
}
