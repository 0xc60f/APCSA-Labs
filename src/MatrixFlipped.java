public class MatrixFlipped {
	public static void matrixFlipped(int[][] mat)
	{
        //Flip the matrix on it's horizontal axis
        for(int i = 0; i < mat.length / 2; i++){
            for(int j = 0; j < mat[i].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[mat.length - 1 - i][j];
                mat[mat.length - 1 - i][j] = temp;
            }
        }
	}
}
