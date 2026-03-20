class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n = grid.length  ;
       long N = (long ) n*n ;
       long actualSum = 0 ;
       long actualSquareSum = 0 ;
        for(int i = 0 ;i<n ; i++ ){
        for(int j = 0 ;j<n ; j++ ){

            int num =grid[i][j];
            actualSum +=num ;
            actualSquareSum += (long) num*num ;
        }

        }
        long expectedSum = (N *(N+1))/2 ;
        long expectedSquareSum = (N *(N+1)*(2*N+1))/6 ;

        long sumDifference = actualSum -expectedSum ;
        long SquareSumDifference = actualSquareSum -expectedSquareSum ;

        long sumAB = SquareSumDifference / sumDifference ;
        int repeated  =(int ) ((sumAB +sumDifference )/2) ;
        int missing= (int ) ((sumAB -sumDifference)/2);
                return new int[]{repeated ,missing} ;

    }
    public static void main(String[] args){
        int[][] grid ={
            { 1 , 2 },
            {1 , 4 }
        };
        Solution sol = new Solution();
        int[] result =sol.findMissingAndRepeatedValues(grid) ;

        System.out.println("repeated" + result[0] +", missing :" + result );
    }
}