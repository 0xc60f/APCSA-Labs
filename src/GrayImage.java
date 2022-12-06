public class GrayImage {
	public static final int BLACK = 0;
	public static final int WHITE = 255;
	public int[][] pixelValues;
	
	public GrayImage(int[][] temp)
	{
		pixelValues = temp.clone();
	}
	
	public int countWhitePixels()
	{
        int count = 0;
        for(int i = 0; i < pixelValues.length; i++){
            for(int j = 0; j < pixelValues[i].length; j++){
                if(pixelValues[i][j] == WHITE){
                    count++;
                }
            }
        }
        return count;
	}
	
	public void processImage()
	{
        for(int i = 0; i < pixelValues.length; i++){
            for(int j = 0; j < pixelValues[i].length; j++){
                if(isValid(i-2, j-2)){
                    if(pixelValues[i][j] - pixelValues[i-2][j-2] < BLACK){
                        pixelValues[i][j] = BLACK;
                    }
                    else{
                        pixelValues[i][j] -= pixelValues[i-2][j-2];
                    }
                }
            }
        }
		
	}
	
	public int[][] getPixelValues()
	{
		return pixelValues;
	}
    public boolean isValid(int row, int col)
    {
        if(row < 0 || row >= pixelValues.length || col < 0 || col >= pixelValues[row].length){
            return false;
        }
        return true;
    }
}
