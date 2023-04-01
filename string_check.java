
import java.util.*;

public class string_check
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------");	
		System.out.print("Enter The String : ");
		String a = sc.nextLine();
		System.out.println("--------------------------------------");
		try
		{
		System.out.print("How Many Time You Want To Print : ");
		int n = sc.nextInt();
		System.out.println("--------------------------------------");
		for(int i = 0;i<n;i++)
		{
			Thread.sleep(1100);
				if(isPalindrome(a))
				{
					System.out.println(a+" is Palindrome "+(i+1)+" Second.");
				}
				else
				{
					System.out.println(a+" is Not Palindrome "+(i+1)+" Second.");
				}
				System.out.println("--------------------------------------");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static boolean isPalindrome(String str)
	{
		int left = 0;
		int right = str.length()-1;
		
		while(str.charAt(left) != str.charAt(right))
		{
			if(left < right)
			{
				return false;
			}
			else
			{	
				left++;
				right--;
			}
		}
	return true; 
	}
}