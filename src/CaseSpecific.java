import static java.lang.System.*;
import java.util.Scanner;

public class CaseSpecific {

	public static void main(String[] args) {
		String line1, line2, line1l, line2l;
		Scanner input = new Scanner(System.in);
		out.println("Enter line 1:");
		line1 = input.nextLine();
		out.println("Enter line 2:");
		line2 = input.nextLine();
		out.println("line 1:" + line1);
		out.println("line 2:" + line2);
		line1l = line1.toLowerCase();
		line2l = line2.toLowerCase();
		out.println("They are the same? " + line1l.equals(line2l));
		line1 = line1.replaceAll("[aeiouAEIOU]", "");
		line2 = line2.replaceAll("[aeiouAEIOU]", "");
		out.println("line 1:" + line1);
		out.println("line 2:" + line2);
		input.close();
	}

}
