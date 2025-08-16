//time TC Worst/BEST = O(N), SC = O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,9};
        int n = arr.length;
        Set<Integer> unique = new HashSet<>();
        for(int i=0; i<n; i++){
            unique.add(arr[i]);
        }
        System.out.println("unique item in array"+ unique.size());
        int k = 0;
        for(int item : unique){
            arr[k] = item;
            k++;
        }
        for(int j=k; j<n; j++){
            arr[j] = 0;
        }
        
        for(int j=0; j<n; j++){
            System.out.println(arr[j]);
        }
        
    }
}


// // Online Java Compiler
// // Use this editor to write, compile and run your Java code online
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         int arr[] = {0,0,3,3,3,5,6};
//         int n = arr.length;
//         int dup = 1;
//         for(int i=1; i<n; i++){
//            if(arr[i]!=arr[dup-1]){
//                arr[dup] = arr[i];
//                dup++;
//            }
//         }
//         System.out.println("unique item in array "+dup);
        
//         for(int j=0; j<n; j++){
//             System.out.println(arr[j]);
//         }
        
//     }
// }
