import static java.lang.System.*;
import java.util.Scanner;
import java.util.Random;

public class MatrixSearch{
    public static void main(String[] args){
        Scanner s = new Scanner(in);
        int row, col, seed;
        int count = 0;
        String emptyString = "";
        String line = "";
        seed = s.nextInt();
        row = s.nextInt();
        col = s.nextInt();
        int[][] mat = new int[row][col];
        Random rand = new Random(seed);
        while(s.hasNext()){
            line = s.next();
            emptyString += line + " ";
        }
        emptyString = emptyString.trim();
        String[] arr = emptyString.split(" ");
        int[] search = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            search[i] = Integer.parseInt(arr[i]);
        }
        //Fill matrix with random numbers
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mat[i][j] = rand.nextInt(100)+1;
            }
        }
        //Print matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                out.print(mat[i][j] + " ");
            }
            out.println();
        }
        //Search for numbers in matrix
        for(int i = 0; i < search.length; i++){
            count = 0;
            for(int j = 0; j < row; j++){
                for(int k = 0; k < col; k++){
                    if(search[i] == mat[j][k] && count == 0){
                        out.println(search[i] + " is at [" + j + "," + k + "]");
                        count++;
                    }
                }
            }
            if(count == 0){
                out.println(search[i] + " is not in matrix");
            }
        }
        s.close();

        
    }
}
