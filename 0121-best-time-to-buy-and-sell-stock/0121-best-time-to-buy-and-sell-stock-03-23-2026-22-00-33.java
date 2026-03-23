class Solution {
    public int maxProfit(int[] n) {
        int profit = 0 ;
        int Buy = Integer.MAX_VALUE;
                for(int i = 0 ; i<n.length ; i++){
                    if(n[i] < Buy){
                        Buy = n[i];
                    }
                    else if ( n[i] - Buy > profit){
                        profit = n[i] -Buy ; 
                    }
                }
                return profit ;
    }
}