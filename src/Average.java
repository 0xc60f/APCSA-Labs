import static java.lang.System.*;
import java.util.Scanner;

public class Average{
    public static void main(String[] args){
        Scanner s = new Scanner(in);
        int sum = 0;
        out.println("Please enter the number of values");
        int num = s.nextInt();
        int[] values = new int[num];
        for(int i = 0; i < num; i++){
            out.println("Please enter the value");
            values[i] = s.nextInt();
        }
        out.println("The array is");
        for(int i = 0; i < num; i++){
            out.print(values[i] + " ");
            sum += values[i];
        }
        double average = (double) sum/num;
        out.println("The average is " + average);
        s.close();
    }
}
