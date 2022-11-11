import java.util.Random;

public class FrogSimulation {
	private int goalDistance;
	private int maxHops;
	private Random rand;
	
	public FrogSimulation(int dist, int numHops, int seed)
	{
		goalDistance = dist;
		maxHops = numHops;
		rand = new Random(seed);
	}
	
	public int hopDistance()
	{
		int x = rand.nextInt(goalDistance/maxHops*4);
		if(rand.nextInt(5) == 0)
			x = -x;
		return x;
	}
	
	public boolean simulate()
	{   
        int distance = 0;
        while(!(distance < 0 || distance >= goalDistance || maxHops == 0))
        {
            distance += hopDistance();
            maxHops--;
        }
        if (distance >= goalDistance)
            return true;
        else if (distance < 0)
            return false;
        else{
            return false;
        }
	}
	
	public double runSimulations(int num)
	{
        int count = 0;
        for(int i = 0; i < num; i++)
        {
            if(simulate())
                count++;
        }
        return count/num;
    }
}
