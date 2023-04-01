import java.util.*;

public class palindrome_string{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String a = sc.nextLine();
        try
        {
            System.out.println("Waiting For 1 Sec !");
            Thread.sleep(1100);
            if(isPalindrome(a))
            {
                System.out.println("("+a+")"+" is Palindrome String.");
            }
            else
            {
                System.out.println("("+a+")"+" is Not Palindrome String.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
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