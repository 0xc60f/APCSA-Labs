import static java.lang.System.*;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {
		String word, sentence, newWord, newSentence;
		Scanner input = new Scanner(System.in);
		out.println("Enter a sentence:");
		sentence = input.nextLine();
		out.println("Enter a word:");
		word = input.nextLine();
		out.println("Enter a replacement word:");
		newWord = input.nextLine();
		out.println(sentence);
		newSentence = sentence.replaceAll(word, newWord);
		out.println(newSentence);
		input.close();
	}

}
