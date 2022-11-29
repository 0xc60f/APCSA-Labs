public class SelfDivisor {
	public static boolean isSelfDivisor(int num)
	{
        boolean isSelf = true;
        int temp = num;
        while (temp > 0)
        {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0)
            {
                isSelf = false;
                break;
            }
            temp /= 10;
        }
        return isSelf;
	}
	
	public static int[] firstNumSelfDivisors(int start, int num)
	{
		int[] selfDivisors = new int[num];
        int count = 0;
        while (count < num)
        {
            if (isSelfDivisor(start) == true)
            {
                selfDivisors[count] = start;
                count++;
            }
            start++;
        }
        return selfDivisors;
	} 

    public static void main(String args[])
    {
        int[] test = firstNumSelfDivisors(10, 3);
        System.out.println(isSelfDivisor(13));
        for (int i = 0; i < test.length; i++)
        {
            System.out.println(test[i]);
        }
    }
}
