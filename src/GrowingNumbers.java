import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class GrowingNumbers {
	public static void main(String args[])throws IOException
	{
		Scanner input = new Scanner(in);
		
	    while(input.hasNext())
		{
			int[] list = peelDigits(input.nextInt());
			String temp = getArray(list);
			temp+=" is ";
			if(!isIncreasing(list))
				temp+="NOT ";
			temp+="strictly increasing. The total is ";
			temp+=getValue(list);
			out.println(temp);
		}
        input.close();
	}
	
	public static int getValue(int[] list)
	{
		int sum = 0;
		for(int x:list)
			sum+=x;
		return sum;
	}
	
	public static int[] peelDigits(int x)
	{
		String temp = ""+x;
		int[] list = new int[temp.length()];
		for(int k=list.length-1; k>=0; k--)
		{
			list[k] = x%10;
			x/=10;
		}
		return list;
	}
	
	public static boolean isIncreasing(int[] list)
	{
		for(int i=1; i<list.length; i++)
			if(list[i-1]>=list[i])
				return false;
		return true;
	}
	public static String getArray(int[] list)
	{
		String str = "[";
		for(int i = 0; i<list.length-1; i++)
			str+=list[i]+",";
		str+=list[list.length-1]+"]";
		return str;			
	}
}
