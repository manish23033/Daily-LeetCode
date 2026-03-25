class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
             for(int i = 0 ; i<n-3 ;i++){
                if(i > 0 && arr[i] == arr[i-1]){
                    continue ;
                }
              for(int j =i+1 ; j<n-2 ; j++){
                 if(j > i+1 && arr[j] == arr[j-1]){
                    continue ;
                }
                long remainTarget = (long) target -arr[i] -arr[j] ;
                int left = j+1 , right =n-1 ;


                 while( left <right ){
                    int sum = arr[left ]+arr[right] ;
                    if(sum < remainTarget){
                        left++;
                    }
                    else if(sum > remainTarget){
                                right-- ;
                    }
                    else{
                        result.add(Arrays.asList(arr[i] , arr[j] , arr[left] , arr[right]));
                        int preLeft =arr[left] , preRight = arr[right] ;
                        while(left < right && arr[left] == preLeft ){
                            left++ ;
                        }
                        while(left < right && arr[right] == preRight){
                            right-- ;
                        }
                    }
                 }   
              }  
             }
        return  result ;
    }
}