import java.util.*;
public class mobile 
{
	int m_code,price;
	String CName,MName;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		mobile[] mob = new mobile[5];
		for(int i=0;i<5;i++)
		{
			mob[i] = new mobile();
			System.out.println("Enter Mobile "+(i+1)+" m_code: ");
			mob[i].m_code = sc.nextInt();
			System.out.println("Enter Company Name For Mobile "+(i+1)+" :  ");
			mob[i].CName = sc.nextLine();
			System.out.println("Enter Brand Name For Mobile "+(i+1)+" : ");
			mob[i].MName = sc.nextLine();
			System.out.println("Enter Price For Mobile "+(i+1)+" : ");
			mob[i].price = sc.nextInt();
			if(price < 7000)
			{
				System.out.println(mob);	
			}
			else
			{
				System.out.println("There Are No Phones Below 7000Rs !");
			}
		}
	}
}