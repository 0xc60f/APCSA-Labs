public class MatrixAverage {
	public static double matrixAverage(double[][] mat)
	{
		double sum = 0;
        int count = 0;
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                sum += mat[i][j];
                count++;
            }
        }
        return sum / count;
	}
}
