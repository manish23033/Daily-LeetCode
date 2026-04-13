class Solution {
    public int getMinDistance(int[] arr, int target, int start) {
        int n = arr.length ;
        // if(arr.length ==0){
        //     return 0 ;
        // }
        
        int result = Integer.MAX_VALUE ; 

        for(int i = 0 ; i<n ; i++){
            if(arr[i] == target){
               result = Math.min(result , Math.abs(i - start ));
            }
            
        }
        return result ;
    }
}