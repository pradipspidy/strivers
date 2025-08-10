class Solution {
    public int reverseNumber(int n) {
        int sum = 0;
        while(n>0){
            int id = n % 10;
            sum = sum*10+id;
            n = n/10;
        }
        return sum;
        
    }
   
}
