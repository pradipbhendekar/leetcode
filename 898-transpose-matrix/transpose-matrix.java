class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int colums=matrix[0].length;
        int[][] result = new int[colums][row];

        for(int i=0; i<row; i++){
            for(int j=0 ;j<colums; j++){
                result[j][i]= matrix[i][j];
            }
        }
        return result;
    }
}