//Linear search
// TC worst:: O(N) BEST:: O(1)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 3};
        int target = 3;
        for(int i=0; i < arr.length; i++){
            if(arr[i]==target){
                 System.out.println("taget is available in index"+ i);
                 break;
            }
        }
        System.out.println("target is not available -1");
    }
}
