//rotate array D postion left
// TC worst:: O(N)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] = {0,1,4,0,5,2};
        int i = 0;
        int j = 1;
        int n = arr.length;
        while(i<n && j<n){
           if(arr[i]==0 && arr[j]==0){
               j++;
           }else if(arr[i]==0 && arr[j]!=0){
               int temp =arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j++;
           }else if(arr[i]!=0 && arr[j]==0){
               i++;
               j++;
           }else{
               i++;
               j++;
           }
        }
       
        for(int k = 0; k<n; k++){
           System.out.println(arr[k]);
        }
    }
}
