// 3Sum Problem
// TC: O(N³)
// SC: O(N) for result storage
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 5, 7, 9};
        int n = arr.length;
        Arrays.sort(arr);
        int target =7;

        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            } 
            for(int j =i+1; j<n;j++){
                if(j!=i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int k =j+1;
                int l = n-1;
                while(k<l){
                long sum = arr[i] + arr[j] + arr [k] + arr[l];
                if (sum==target){
                    int temp[] = {arr[i],arr[j],arr[k],arr[l]};
                   res.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                    k++;
                    l--;
                    while(k<l && arr[k]==arr[k-1]){
                    continue;
                }
                while(k<l && arr[l]==arr[l++]){
                    continue;
                }
                }else if(sum<target){
                    k++;
                }else{
                    l--;
                }
               
                }
               
            }
        }
        for (List<Integer> triplet : res) {
            System.out.println(triplet);
        }
    }
}
