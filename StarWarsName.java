import static java.lang.System.*;
import java.util.Scanner;

public class StarWarsName {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("What is your name:");
        String name = keyboard.nextLine();
        out.println("What street do you live on:");
        String street = keyboard.nextLine();
        out.println("What car does your family own:");
        String car = keyboard.nextLine();
        String starWarsName = starWarsName(name,street,car);
        out.println("Hi, " + formatName(name) + "! Did you know your Star Wars name is " + starWarsName + "?");
        keyboard.close();
    }
    public static String starWarsName(String name, String street, String car) {
        String name1 = name.substring(name.length()-3);
        String starName = "";
        for (int i = 0; i < name1.length(); i++) {
            starName = name1.charAt(i) + starName;
        }
        char firstLname = starName.charAt(0);
        char capFirstLname = Character.toUpperCase(firstLname);
        String starNameLower = starName.substring(1);
        String starName2 = capFirstLname + starNameLower.toLowerCase();
        String street1 = street.substring(0,5);
        street1 = street1.toLowerCase();
        String starCar = car.substring(1,car.length()-1);
        char firstLcar = starCar.charAt(0);
        char capFirstLcar = Character.toUpperCase(firstLcar);
        String starCarLower = starCar.substring(1);
        String starCar2 = capFirstLcar + starCarLower.toLowerCase();
        String starWarsName = starName2 + street1 + " of " + starCar2;
        return starWarsName;

    }
    public static String formatName(String n){
        int indexOfthis = n.indexOf(" ");
        String firstName = n.substring(0,indexOfthis);
        return firstName;
    }
}
