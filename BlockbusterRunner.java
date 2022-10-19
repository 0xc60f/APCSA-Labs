import static java.lang.System.*;
import java.util.Scanner;
//import java.io.*;

public class BlockbusterRunner {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		Blockbuster movie1, movie2;
		String movie;
		double cost, price, diff;
		int tickets;
		
		out.println("Please enter movie title:");
		movie = input.nextLine();
		out.println("Please enter cost of production:");
		cost = input.nextDouble();
		out.println("Please enter number of tickets sold:");
		tickets = input.nextInt();
		out.println("Please enter price of a ticket:");
		price = input.nextDouble();
		input.nextLine(); //buffer cleared
		
		movie1 = new Blockbuster(movie, cost);
		movie1.setBoxOffice(tickets, price);
		
		out.println("Please enter movie title:");
		movie = input.nextLine();
		out.println("Please enter cost of production:");
		cost = input.nextDouble();
		out.println("Please enter number of tickets sold:");
		tickets = input.nextInt();
		input.close();
		
		
		movie2 = new Blockbuster(movie, cost);
		movie2.setBoxOffice(tickets, price);
		
		out.println(movie1+"\n"+movie2);
		
		out.println(movie1.getTitle()+" netted "+String.format("%.2fM",inMillions(movie1.getNet())));
		out.println(movie2.getTitle()+" netted "+String.format("%.2fM",inMillions(movie2.getNet())));
		
		diff = movie1.diff(movie2);
		diff = inMillions(Math.abs(diff));
		out.println("The difference between "+movie1.getTitle()+
				    " and "+movie2.getTitle()+" is $"+String.format("%.2fM",diff));

	}
	
	public static double inMillions(double val)
	{
		return val/1000000;
	}
}
