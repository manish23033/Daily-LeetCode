class Solution {
    public int[] searchRange(int[] arr, int target) {
            int start = atFirst(arr , target);
            int last = atLast(arr , target);
            return new int[]{start , last };
    }

    public int atFirst(int[] arr ,int  target ){
        int st = 0 ;
        int end =arr.length -1 ;
            int ans = -1 ;
        while(st <= end){
            int mid = st +(end -st )/2 ;
                if(arr[mid] == target){
                    ans =  mid ;
                    end =mid -1 ;
                }
                else if (arr[mid] < target){
                    st = mid+1 ;
                }
                else {
                    end = mid-1 ;
                }
        }
        return ans ;
        }
        public int atLast(int[] arr ,int  target ){
        int st = 0 ;
        int end =arr.length -1 ;
            int ans = -1 ;
        while(st <= end){
            int mid = st +(end -st )/2 ;
                if(arr[mid] == target){
                    ans =  mid ;
                    st =mid +1 ;
                }
                else if (arr[mid] < target){
                    st = mid+1 ;
                }
                else {
                    end = mid-1 ;
                }
        }
        return ans ;
        }
    
}