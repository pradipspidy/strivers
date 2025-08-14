// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("length: "+n);
        for (int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        for (int k=0; k<n; k++)
        {
            System.out.println(arr[k]);
        }
    }
}
