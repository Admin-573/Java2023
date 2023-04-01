import java.util.*;
public class papa
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The String: ");
		String a = sc.nextLine();
		System.out.println("Wait For 1 Sec !");
		try
		{
			Thread.sleep(1100);
			if(isPalindrome(a))
			{
				System.out.println(a+" is Palindrome.");
			}
			else
			{
				System.out.println(a+" is Not Palindrome.");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static boolean isPalindrome(String str)	
	{
		int left=0 , right=str.length()-1 ;
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