import java.util.Scanner;
import static java.lang.System.*;

public class SieveEratosthenes {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(in);
        int n = keyboard.nextInt();
        boolean[] isPrime = new boolean[n+1];
        for(int i = 2; i <= n; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i; i*j <= n; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        printList(isPrime);
        keyboard.close();
    }
    public static void printList(boolean list[])
	{
		int count = 0;
		for(int i = 2; i<list.length; i++)
		{
			if(list[i])
			{
				out.print(String.format("%5d",i));
				count++;
				if(count%15 == 0)
					out.println();
			}
		}
	}
}
