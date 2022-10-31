import static java.lang.System.*;
import java.util.Scanner;

public class EnigmaMachine2{
    public static void main(String[] args){
        Scanner input = new Scanner(in);
        String scrambled; int rotation; String message = "";
        out.println("Enter in the scrambled alphabet");
        scrambled = input.nextLine();
        out.println("Enter in the rotation");
        rotation = input.nextInt();
        input.nextLine();
        out.println("Enter in 5 letter message");
        message = input.nextLine();
        input.close();
        String decoded = decode(scrambled, rotation, message);
        out.println(decoded);
    }
    public static String decode(String alpha, int rot, String msg){
        String norAl = "abcdefghijklmnopqrstuvwxyz";
        String encoded = "";
        for (int i = 0; i < msg.length(); i++){
            int index = alpha.indexOf(msg.charAt(i));
            encoded += norAl.charAt(index);
            alpha = rotate(alpha, rot);
        }
        return encoded;
    }
    public static String rotate(String alphaScram, int rotation){
        return alphaScram.substring(rotation) + alphaScram.substring(0, rotation);
    }
}
