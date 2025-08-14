// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("length: "+n);
        for (int i=0; i<n-1; i++){
            int min =i;
            for(int j=i; j<n; j++){
                if(arr[min] > arr[j]){
                    min =j;
                }
            }
            int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                // break;
        }
        for (int k=0; k<n; k++)
        {
            System.out.println(arr[k]);
        }
    }
}
