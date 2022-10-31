import static java.lang.System.*;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		String firstName, lastName, fullName, pig1, pig2, pig3, pig4, firstPig, lastPig;
		int nameSep;
		Scanner input = new Scanner(System.in);
		out.println("Enter your name:");
		fullName = input.nextLine();
		fullName = fullName.toLowerCase();
		nameSep = fullName.indexOf(" ");
		firstName = fullName.substring(0, nameSep);
		lastName = fullName.substring(nameSep + 1);
		pig1 = firstName.substring(0,1);
		pig2 = lastName.substring(0,1);
		pig3 = firstName.substring(1,2);
		pig3 = pig3.toUpperCase();
		pig4 = lastName.substring(1,2);
		pig4 = pig4.toUpperCase();
		firstPig = pig3 + firstName.substring(2) + pig1 + "ay";
		lastPig = pig4 + lastName.substring(2) + pig2 + "ay";
		out.println("Hello, " + firstPig + " " + lastPig + "!");
		input.close();
	}

}
