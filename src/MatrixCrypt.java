import static java.lang.System.*;
import java.util.Scanner;

public class MatrixCrypt{
    public static void main(String[] args){
        Scanner s = new Scanner(in);
        int length = 0;
        String str = "";
        while (s.hasNext()){
            str = s.nextLine();
            length = str.length();
            codeSolution(str, length);
        } 
        s.close();
    }
    public static void codeSolution(String str, int length){
        int lengthrow = (int) Math.sqrt(length);
        int lengthcol = (int) Math.sqrt(length);
        while (lengthrow * lengthcol < length){
                lengthcol++;
        }
        String[][] matrix = new String[lengthrow][lengthcol];
        fillMatrix(str, matrix);
        printMatrix(matrix, str);
    }
    public static void fillMatrix(String line, String[][] matrix){
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (count < line.length()){
                    matrix[i][j] = line.substring(count, count + 1);
                    count++;
                }
                else{
                    matrix[i][j] = "X";
                }
            }
        }
    }
    public static void printMatrix(String[][] matrix, String line){
        String line2 = "";
        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                line2 += matrix[j][i];
            }
        }
        out.println(line + " ==> " + line2);
    }
}
