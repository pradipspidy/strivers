// leader
// TC O(N)
// SP WC::O(N)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 1, 2};
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int lead = arr[n-1];
        res.add(lead);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=lead){
                lead =arr[i];
                res.add(arr[i]);
            }
        }
        int len = res.size();
        int left= 0;
        int right = len-1;
        while(left<right){
            int temp = res.get(left);
            res.set(left,res.get(right));
            res.set(right,temp);
            left++;
            right--;
        }
        
        for(int k=0; k<res.size(); k++){
        System.out.println(res.get(k));
        }
    }
 }
