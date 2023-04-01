import java.util.*;
public class palindrome_checking
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The String Or Number : ");
		String a = sc.next();
		System.out.println("Wait For 1 Sec !");
		try
		{
		Thread.sleep(1100);
		System.out.print("Enter Seconds: ");
		int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
			Thread.sleep(1100);
				if(isPalindrome(a))
				{
					System.out.println(a+" is Palindrome "+(i+1)+" Second !");
				}
				else
				{
					System.out.println(a+" is Not Palindrome "+(i+1)+" Second !");
				}
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static boolean isPalindrome(String str)
	{
		int left=0;
		int right=str.length()-1;
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