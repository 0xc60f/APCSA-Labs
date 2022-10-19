import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class QED {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x0, y0, x1, y1, x2, y2;
        double anglezero, angleone, r2, distance, reflection, anglezerorad, angleonerad;
        out.println("Enter in x0");
        x0 = input.nextInt();
        out.println("Enter in y0");
        y0 = input.nextInt();
        out.println("Enter in the r2 of arrow, between 0 and 0.400");
        r2 = input.nextDouble();
        out.println("Enter in theta1 in degrees");
        anglezero = input.nextDouble();
        out.println("Enter in theta2 in degrees");
        angleone = input.nextDouble();
        input.nextLine();
        input.close();

        anglezerorad = anglezero * Math.PI / 180;
        angleonerad = angleone * Math.PI / 180;
        x1 = x0 + r2 * Math.cos(anglezerorad);
        y1 = y0 + r2 * Math.sin(anglezerorad);
        x2 = x1 + r2 * Math.cos(angleonerad);
        y2 = y1 + r2 * Math.sin(angleonerad);
        distance = Math.sqrt(Math.pow(x2 - x0, 2) + Math.pow(y2 - y0, 2));
        reflection = Math.pow(distance, 2);

        out.printf("The reflection percentage is " + "%.3f",(reflection));


    }
}
