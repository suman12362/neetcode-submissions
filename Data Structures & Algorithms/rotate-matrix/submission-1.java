class Solution {
    public void rotate(int[][] matrix) {
         int r = matrix.length;
        int c = matrix[0].length;
       // int[][] matrix2 = new int[matrix.length][matrix[0].length];
        for(int i =0;i<(r+1)/2;i++){
            for(int j =0;j<c/2;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[c-j-1][i];
                matrix[c-j-1][i] = matrix[r-i-1][c-j-1];
                matrix[r-i-1][c-j-1] = matrix[j][r-i-1];
                matrix[j][r-i-1] = t;
                // matrix[j][r-i-1] =  matrix[r-i-1][c-j-1];
                // matrix[r-i-1][c-j-1] = matrix[c-j-1][i];
                // matrix[c-j-1][i] = t;
            }
        }
    }
}
