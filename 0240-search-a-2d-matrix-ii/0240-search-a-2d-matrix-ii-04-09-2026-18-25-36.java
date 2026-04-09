class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

         HashSet<Integer>  set = new HashSet<>();

         for(int i =0 ; i< m; i++){
         for(int j =0 ; j< n; j++){
            set.add(arr[i][j]);
         }
         }
         return set.contains(target);
    }
}