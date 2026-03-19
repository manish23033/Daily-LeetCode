class Solution {
    public int majorityElement(int[] num) {
        int fre = 0;
        int n = num.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(fre == 0){
                ans = num[i];
            }

            if(ans == num[i]){
                fre++;
            } else {
                fre--;
            }
        }
        int count = 0;
        for(int val : num){
            if(val == ans){
                count++;
            }
        }
        if(count > n / 2){
            return ans;
        } else {
            return -1;
        }
    }
}