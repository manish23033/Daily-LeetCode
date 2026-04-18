class Solution {
    public int findKthPositive(int[] arr, int k) {
        int curr = 1 ;
        int count = 0 ;
        int i =0 ;
        while(true ){
            if(i < arr.length && arr[i] == curr){
                i++;
            }
            else{
                count++ ;
                if(count == k){
                   return curr  ;
                }
            }
        
         curr++;
    }
}
}