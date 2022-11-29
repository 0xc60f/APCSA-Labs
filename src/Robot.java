public class Robot {
	private int[] hall;
	private int pos;
	private boolean facingRight;
	
	public Robot(String x)
	{
		String[] list = x.split(" ");
		hall = new int[list.length];
		pos = list.length/2;
		facingRight = false;
		for(int i=0; i<list.length; i++)
			hall[i]=Integer.parseInt(list[i]);
	}
	
	private boolean forwardMoveBlocked()
	{
		if (facingRight == true)
        {
            if (pos == hall.length-1)
                return true;
            else
                return false;
        }
        else
        {
            if (pos == 0)
                return true;
            else
                return false;
        }
	}
	
	public void move()
	{
		if (hall[pos] > 0){
            hall[pos]--;
        }
        else if (forwardMoveBlocked() == false)
        {
            if (facingRight == true)
                pos++;
            else
                pos--;
        }
        else
        {
            facingRight = !facingRight;
        }
	}
	
	public int clearHall()
	{
        int i = 0;
		while (hallIsClear() == false)
        {
            move();
            i++;
        }
        return i;
	}
	
	private boolean hallIsClear()
	{
		for(int k:hall)
			if(k > 0 )
				return false;
		return true;
	}
}
