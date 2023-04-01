import java.util.*;

interface kilometer
{
	void convert_unit();
}
	class meter implements kilometer
	{
		public void convert_unit()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Kilometer : ");
			int km_meter = sc.nextInt();
			System.out.println("Conversion Kilometer To meter : "+(km_meter*1000)+" meter");
		}
	}
	class centimeter implements kilometer
	{
		public void convert_unit()
		{
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Enter Kilometer : ");
			int km_cm = sc1.nextInt();
			System.out.println("Conversion Kilometer To centimeter : "+(km_cm*100000)+" centimeter");		
		}
	}
	class feet implements kilometer
	{		
		public void convert_unit()
		{
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter Kilometer : ");
			int km_feet = sc2.nextInt();
			System.out.println("Conversion Kilometer To Feet : "+(km_feet*3281)+" Feet");	
		}
	}
public class conversion
{
	public static void main(String args[])
	{
		Scanner sc3 = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Kilometer To meter .");
			System.out.println("2.Kilometer To centimeter .");
			System.out.println("3.Kilometer To feet .");
			System.out.println("4.Exit .");
			System.out.println();
			System.out.print("Enter The Choice : ");
			int choice = sc3.nextInt();
			switch(choice)
			{
				case 1:
				{
					kilometer k1 = new meter();
					k1.convert_unit();
					break;
				}
				case 2:
				{
					kilometer k2 = new centimeter();
					k2.convert_unit();
					break;
				}
				case 3:
				{
					kilometer k3 = new feet();
					k3.convert_unit();
					break;
				}
				case 4:
				{
					return;					
				}
			}
		}
	}
}