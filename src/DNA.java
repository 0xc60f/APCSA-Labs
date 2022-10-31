import static java.lang.System.*;

import java.util.Scanner;

public class DNA {

    public static void main(String[] args) {
        String seq1, seq2;
        int app1, app2, app3;
        Scanner input = new Scanner(System.in);

        out.print("Enter DNA Sequence:");
        seq1 = input.nextLine();
        out.print("Enter DNA Sequence:");
        seq2 = input.nextLine();

        app1 = seq1.indexOf(seq2, seq1.indexOf(seq2) + 1);
        //app2if = seq1.substring(app1);
        app2 = seq1.indexOf(seq2, seq1.indexOf(seq2, app1) + 1);
        app3 = seq1.lastIndexOf(seq2, seq1.lastIndexOf(seq2) - 1);

        out.println("The sequence of " + seq1 + " has the " + seq2 + " appear at:");
        out.println("Second appearance:" + app1);
        out.println("Third appearance:" + app2);
        out.println("Second to last appearance:" + app3);
        input.close();
    }

}
