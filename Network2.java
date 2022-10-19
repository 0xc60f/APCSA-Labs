import java.util.*;
import static java.lang.System.*;

public class Network2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(in);
		String key, description;
		boolean outcome;
		
		key = input.nextLine();
		description = input.nextLine();
		outcome = find(description,key);
		out.println(outcome+" --> key: "+key+" description: "+description);
		input.close();
	}
	public static boolean find(String description, String key) {
		boolean op1, op2, op3;
		boolean finalOp;
		int keyPos = description.indexOf(key);
		String lastChar = key.substring(key.length()-1);
		int lastLoc = description.indexOf(lastChar, keyPos);
		if (keyPos == -1) {
			op1 = false;
		}
		else {
			op1 = true;
		}
		if (keyPos == 0) {
			op2 = true;
		}
		else {
			if (description.charAt(keyPos-1) == ' ') {
				op2 = true;
			}
			else {
				op2 = false;
			}

			}
		if (lastLoc == description.length()-1) {
			op3 = true;
		}
		else {
			if (description.charAt(lastLoc+1) == ' ') {
				op3 = true;
			}
			else {
				op3 = false;
			}
		}
		if (op1 && (op2 || op3)) {
			finalOp = true;
		}
		else {
			finalOp = false;
		}

		return finalOp;
		}

	//method goes here
	
}
