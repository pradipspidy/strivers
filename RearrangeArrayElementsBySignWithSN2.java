// Rearrange array elements by sign
// TC O(N)
// SP WC::O(N)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] ={2, 4, 5, -1, -3, -4};
        int n = arr.length;
        List<Integer> fArr = new ArrayList<>(Collections.nCopies(n, 0));
        int pos=0;
        int neg=1;
        for (int i=0; i<n; i++){
            if(arr[i]>0){
                 fArr.set(pos,arr[i]);
                 pos += 2;
            }
            else{
               fArr.set(neg,arr[i]);
                neg += 2;
            }
        }
        for(int k=0; k<n; k++){
        System.out.println(fArr.get(k));
    }
    }
       
}
