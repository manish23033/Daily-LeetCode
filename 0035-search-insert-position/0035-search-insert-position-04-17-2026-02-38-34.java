class Solution {
    public int searchInsert(int[] arr, int target) {
        int st = 0 ;
        int last = arr.length-1 ;
        int ans =arr.length ;
        while (st <= last ){
            int mid = st +(last -st)/2;
                if(arr[mid ] == target ){
                    ans = mid ;
                    break ;
                }
                else if(arr[mid ] < target ){
                    
                    st =mid+1 ;
                    
                }
                else {
                    ans =mid ;
                    last =mid-1;
                }
        }
        return ans ;

    }
}