import java.util.*;
public class admin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.print("Enter The String Or Number : ");
		String a = sc.nextLine();
		System.out.println("Wait For 1 Sec Its Compiling !");
		try
		{
		Thread.sleep(1500);
		System.out.println("------------------------------------------");
		System.out.println("Now Printing At Every 1 Second !");
		System.out.println("------------------------------------------");
			for(int i=0;i<5;i++)
			{
			Thread.sleep(1250);
				if(isPalindrome(a))
				{
					System.out.println(a+" is Palindrome String. "+(i+1)+" Second ->");
				}
				else
				{
					System.out.println(a+" is not Palindrome String. "+(i+1)+" Second ->");
				}
			}
			System.out.println("------------------------------------------");
		}
		catch(Exception e)
		{System.out.println(e);}
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