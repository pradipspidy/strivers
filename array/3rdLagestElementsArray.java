//time complexity of this is O(N)
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
       int arr[] = {3,5,4,2,9,1,6};
       int n = arr.length;
       int mx = arr[0];
       int mx2 = 0;
       int mx3 = 0;
       for (int i = 1; i<n; i++){
           if (mx<arr[i]){
               mx3 = mx2;
               mx2 = mx;
               mx = arr[i];
           }else if(arr[i]> mx2 && mx>arr[i]){
                mx3 = mx2;
                mx2 = arr[i];
           }else if(arr[i]> mx3 && mx2>arr[i]){
               mx3 = arr[i];
           }
       }
       System.out.println("max::"+ mx3);
    }
    
}
