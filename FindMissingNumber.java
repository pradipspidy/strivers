//Linear search
// TC O(n)
// SP WC::O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
         int arr[] = {0, 2, 3, 1, 4};
         int n = arr.length;
         int total = n*(n+1)/2;
         int actualTotal=0;
         for(int value: arr){
            actualTotal +=value;
         }
         System.out.println("missingNumber:: "+ (total-actualTotal));
    }
    
}
