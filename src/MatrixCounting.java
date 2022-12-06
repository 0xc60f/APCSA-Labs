public class MatrixCounting {
	public static int matrixCount(int[][] mat, int n)
	{
        int count = 0;
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                if (mat[i][j] == n)
                {
                    count++;
                }
                if(mat[i][j] < 0)
                {
                    mat[i][j] *= -1;
                }
            }
        }
		return count;
    }	
}
