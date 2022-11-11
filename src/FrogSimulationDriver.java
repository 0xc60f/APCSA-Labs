import static java.lang.System.*;
import java.util.Scanner;

public class FrogSimulationDriver {
	public static void main(String args[])
	{
	    Scanner s = new Scanner(in);
        out.println("Enter distance");
        int dist = s.nextInt();
        out.println("Enter maximum number of hops");
        int numHops = s.nextInt();
        out.println("Enter random seed value");
        int seed = s.nextInt();
        out.println("Enter the number of simulations");
		int numSim = s.nextInt();
        FrogSimulation fs = new FrogSimulation(dist, numHops, seed);
		double pct = fs.runSimulations(numSim);
		
		out.println("After "+numSim+" simulations, the frog succeeds "+pct+" of the time.");
        s.close();
	}
}
