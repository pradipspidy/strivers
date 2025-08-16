//Largest Element in an Array
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
       int arr[] = {3,3,6,1};
       int n = arr.length;
       int max = 0;
       for (int i = 1; i<n; i++){
           if (arr[max]<arr[i]){
               max = i;
           }
       }
       System.out.println("max::"+ arr[max]);
    }
    
}
