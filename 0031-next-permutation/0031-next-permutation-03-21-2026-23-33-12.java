class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length ;

        int pivot =-1 ;
        for(int i =n-2 ; i>=0 ; i--){
            if(arr[i] <arr[i+1]){
                pivot =i ;
                break ;
            }
        }
        if(pivot == -1 ){
            reverse(arr  , 0, n-1);
            return ;
        }
        int successor = -1 ;
        for(int i  =n-1 ; i>pivot ; i--){
            if(arr[i] > arr[pivot]){
                successor =i ;
                break ; 
            }
        }
        swap(arr , pivot ,successor);
            reverse(arr , pivot+1 ,n-1 );
    } 
    private void swap (int[] arr , int i , int j ){
        int temp =arr[i];
        arr[i] = arr[j]; 
        arr[j] =temp ;
    }
        private void reverse(int[] arr , int start , int end ){
            while(start < end ){
                swap(arr , start , end );
                start ++ ;
                end -- ;
            }
        }

    
}