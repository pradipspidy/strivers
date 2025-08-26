//time complexity of this is worst case::O(N), Best Case:: O(N)
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,6,9};
       int n = arr.length;
       int mx = 0;
       int srt =1;
       for (int i = 1; i<n; i++){
           if (mx<arr[i]){
               mx= arr[i];
              
           }else{
               srt=0;
               break;
           }
       }
       if(srt==0){
            System.out.println("Array is not sorted");
       }else{
            System.out.println("Array is sorted");
       }
      
    }
    
}
