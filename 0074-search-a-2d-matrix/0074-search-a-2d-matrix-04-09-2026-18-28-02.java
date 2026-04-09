class Solution {
    public boolean  searchMatrix(int[][] arr, int target) {
        int m= arr.length ;
        int n = arr[0].length ;
         
                    int  start = 0 ;
                    int end =m*n -1 ;
                    
                    while(start <= end ){
                    int mid =  start +(end - start) /2 ;

                    int ri = mid /n ;
                    int ci = mid % n ; 

                       if(arr[ri][ci ]== target ){
                        return true  ;
                       }
                       else if ( arr[ri][ci] < target ){
                        start = mid +1 ;
                       }
                       else {
                        end = mid -1 ;
                       }
                    }
            
        
        return false ;
          
    }
}