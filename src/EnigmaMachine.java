import static java.lang.System.*;
import java.util.Scanner;

public class EnigmaMachine{
    public static void main(String[] args){
        String scrambled = ""; String message = "";
        int rotation;

        Scanner input = new Scanner(System.in);
        out.println("Enter in the scrambled alphabet");
        scrambled = input.nextLine();
        out.println("Enter in the rotation");
        rotation = input.nextInt();
        input.nextLine();
        out.println("Enter in 5 letter message");
        message = input.nextLine();
        /*out.println(rotate(scrambled, rotation));
        out.println(rotate(scrambled, rotation));
        out.println(rotate(scrambled, rotation)); */
        out.println(encode(scrambled, message, rotation));
        input.close();
    }
    public static String encode(String scrambled, String message, int rotation){
        String norAl = "abcdefghijklmnopqrstuvwxyz";
        String encoded = "";
        for (int i = 0; i < message.length(); i++){
            int index = norAl.indexOf(message.charAt(i));
            encoded += scrambled.charAt(index);
            scrambled = rotate(scrambled, rotation);
        }
        return encoded;
    }
    public static String rotate(String scrambled, int rotation){
            return scrambled.substring(rotation) + scrambled.substring(0, rotation);
        }
    }


