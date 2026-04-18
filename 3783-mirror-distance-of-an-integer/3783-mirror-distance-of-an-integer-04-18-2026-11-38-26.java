class Solution {
    public int mirrorDistance(int n) {
        int rev = reverse(n);
        int ans = Math.abs(n - rev);
      return ans ;
    }
    public int reverse(int x ){
        int rev = 0;
        while(x!=0){
        int digit = x% 10 ;
         rev= rev*10 +digit;
        x =x/10 ;
        }
        return rev;
    }
}