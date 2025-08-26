// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
       int arr[] = {3,5,4,2,9,1,6};
       int len = arr.length;
       int low =0;
       int high = len-1;
       MergeSort(arr, low, high);
       for (int k=0; k<len; k++)
        {
            System.out.println(arr[k]);
        }
       
    }
    
    public static void MergeSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid = (high+low)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        ArrSort(arr, low, mid, high);
    }
   public static void ArrSort(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
           if(arr[left]<=arr[right]){
               temp.add(arr[left]);
               left++;
           }else{
               temp.add(arr[right]);
               right++;
           }
        }
          while(left<=mid){
               temp.add(arr[left]);
               left++;
          }
           while(right<=high){
               temp.add(arr[right]);
               right++;
          }
        for(int i = low; i<=high; i++){
            //  System.out.println("low::"+low+" high::"+high+" i::"+i+" i-low ::"+ (i-low)+" temp Value:: "+temp.get(i - low) );
            arr[i] = temp.get(i - low);
        }
    }
}
