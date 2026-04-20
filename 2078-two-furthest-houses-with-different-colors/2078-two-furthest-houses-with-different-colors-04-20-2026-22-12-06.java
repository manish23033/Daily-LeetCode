class Solution {
    public int maxDistance(int[] colors) {
      int n = colors.length;
        int result = 0;
      for(int i = 0 ; i< n ; i++){
        for( int j = i+1 ;j<n ; j++){
            if(colors[i] != colors[j]){
            int sum = Math.abs(i-j);
            result = Math.max(result ,sum );
        }
      }
      }
      return result;
    }
}