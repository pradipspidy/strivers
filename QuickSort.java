// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void main(String[] args) {
        int arr[] = {3,5,4,2,9,1,6};
        int len = arr.length;
        int lb =0;
        int hb =len-1;
      QuickSort(arr, lb ,hb);
      for (int k=0; k<len; k++)
        {
            System.out.println(arr[k]);
        }
}
   public static void QuickSort(int[] arr, int lb, int hb){
       if(lb<hb){
        int end = partion(arr, lb, hb);
        QuickSort(arr,lb, end-1);
        QuickSort(arr, end+1, hb);
    }
   }
    public static int partion(int[] arr, int lb, int hb){
        int start=lb;
        int end=hb;
        int pivot=arr[start];
        while(start<end){
            while(start <= hb  && arr[start]<=pivot ){
                start++;
            }
             while(end >= lb && pivot<arr[end]){
                end--;
            }
            if (start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp = arr[lb];
                arr[lb] = arr[end];
                arr[end] = temp;
                
        return end;
        
    }
    
}
