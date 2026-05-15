class Solution {
    public int findMin(int[] arr) {
        int st = 0 ; 
        int end = arr.length-1 ;
        int ans = arr[0];
        
        while(st <= end ){
            int mid = st + (end - st )/2 ;
            if( arr[mid] >= arr[0]){
                st = mid+1 ;
            }
            else {
                ans = arr[mid] ;
                end = mid -1 ;
            }
        }
        return ans ;
    }
}