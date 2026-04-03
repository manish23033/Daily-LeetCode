class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> position = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        // Store only zero positions
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    position.add(new int[]{i, j});
                }
            }
        }

        // Set rows and columns to zero
        for(int[] pos : position){
            int x = pos[0], y = pos[1];

            // Row
            for(int i = 0; i < n; i++){
                matrix[x][i] = 0;
            }

            // Column
            for(int i = 0; i < m; i++){
                matrix[i][y] = 0;
            }
        }
    }
}