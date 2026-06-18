class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] matrix2 = new int[matrix.length][matrix[0].length];
        for(int j= 0;j<c;j++){
            for(int i = r-1,k =0;i>=0 && k<c;i--,k++){
                matrix2[j][k] = matrix[i][j];
            }
        }
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j] = matrix2[i][j];
            }
        }
    }
}
