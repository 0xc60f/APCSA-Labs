import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class Shuffle{
    public static void main(String[] args){
        Scanner s = new Scanner(in);
        int randInt = s.nextInt();
        Random rand = new Random(randInt);
        int[] list = new int[52];
        for(int i = 0; i < list.length; i++){
            list[i] = i + 1;
        }
        for (int j = 0; j < 52; j++){
            int k = rand.nextInt(52);
            int temp = list[j];
            list[j] = list[k];
            list[k] = temp;
        }
        for (int k = 0; k < 52; k++){
            out.print(list[k] + " ");
        }
        s.close();
    }
}
