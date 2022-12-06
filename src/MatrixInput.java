import static java.lang.System.*;
import java.util.Scanner;

public class MatrixInput{
    public static void main(String[] args){
        int row, col;
        int increment = 1;
        Scanner input = new Scanner(in);
        out.println("Enter the number of rows");
        row = input.nextInt();
        out.println("Enter the number of cols");
        col = input.nextInt();

        int [] [] matrix = new int [row] [col];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                //Enter the values from one to the row times column
                matrix[i][j] = increment;
                increment++;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                //Enter the values from one to the row times column
                out.print(matrix[i][j] + " ");
            }
            out.println();
        }
        input.close();
    }
}
