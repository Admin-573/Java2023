import java.util.*;
public class softwares
{
	String price,name;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		// Taking Input For 10 Softwares:-
		softwares[] sw = new softwares[10];
		for(int i=0;i<10;i++)
		{
			sw[i] = new softwares();
			System.out.println("Enter name of no."+(i+1)+" Software.");
			sw[i].name = sc.next();
			System.out.println("Enter price of no."+(i+1)+" Software.");
			sw[i].price = sc.next();
			System.out.println();
		}	
		
		// Printing All Data At Interval Of 1 Second:-
		System.out.println("Data Displayed At Interval Of 1 Second !");
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1100);
				System.out.println("Name: "+sw[i].name+"| Price: "+sw[i].price);
			}
			catch(Exception e)
			{System.out.println(e);}
		}
	}
}