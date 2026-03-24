class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n  = arr.length; 
            List<List<Integer>> result = new ArrayList<>();

            Arrays.sort(arr);

            for(int i = 0 ; i< n-2 ; i++){
                if(i>0 && arr[i] == arr[i-1]){
                    continue ;
                }
                int target = -arr[i] ;
                int left  = i+1 , right = n-1 ;
                while(left < right){
                    int sum = arr[left] +arr[right ] ;
                    if(sum == target ){
                    result.add(Arrays.asList(arr[i] , arr[ left],  arr[right]));
                    while ( left <right && arr[left] == arr[left+1]){
                        left++ ;
                    }
                    while ( left <right && arr[right] == arr[right-1]){
                        right-- ;
                    }
                    left++ ;
                    right -- ;

                    }
                    else if ( sum < target ){
                        left++ ;
                    }
                    else{
                        right -- ;
                    }
                }
            }
          return result ;
    }
}