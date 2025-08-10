class Solution {
    public boolean isPalindrome(int n) {
        int sum = 0;
        int dup = n;
        while (n > 0) {
            int id = n % 10;
            sum = sum * 10 + id;
            n = n / 10;
        }
         if (dup == sum){
            return true;
        }else {
            return false;
        }
    }
}
