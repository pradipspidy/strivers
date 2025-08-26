// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int arr[] = {5,4,10,1,6,2};
        int n = arr.length;
        for (int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            
        }
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
}
