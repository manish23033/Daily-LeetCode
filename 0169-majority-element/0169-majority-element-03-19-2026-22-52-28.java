class Solution {
    public int majorityElement(int[] num) {
        int fre = 1;
        int n = num.length;
        int ans = num[0];
        for(int i = 1; i < n; i++){
           if(num[i] == num[i-1]){
            fre++ ;
           }
           else{
            fre=1 ;
            ans=num[i];
           }
        }
        
        if(fre > n / 2){
            return ans;
        }
        return ans ;
    }
}