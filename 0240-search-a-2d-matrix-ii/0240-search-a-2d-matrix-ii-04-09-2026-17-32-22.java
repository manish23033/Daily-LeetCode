class Solution {
    public boolean  searchMatrix(int[][] arr, int target) {
        int m= arr.length ;
        int n = arr[0].length ;
         
        for(int i = 0 ; i<m ;i++ ){
            if(arr[i][0] <= target && target <= arr[i][n-1]){
                    int  start = 0 ;
                    int end = n-1 ;
                    while(start <= end ){
                       int  mid = (start + end )/ 2 ;

                       if(arr[i][mid ]== target ){
                        return true  ;
                       }
                       else if ( arr[i][mid] < target ){
                        start = mid +1 ;
                       }
                       else {
                        end = mid -1 ;
                       }
                    }
            }
        }
        return false ;
          
    }
}