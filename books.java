import java.util.*;
public class books
{
    String ISBN_NO,Title,Publisher,Price;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        books[] b1 = new books[5];
        for(int i=0;i<5;i++)    
        {
            b1[i] = new books();
            
            System.out.print("Enter ISBN_NO No."+(i+1)+" Book: ");
            b1[i].ISBN_NO = sc.next();

            System.out.print("Enter Title No."+(i+1)+" Book: ");
            b1[i].Title = sc.next();

            System.out.print("Enter Publisher No."+(i+1)+" Book: ");
            b1[i].Publisher = sc.next();

            System.out.print("Enter Price No."+(i+1)+" Book: ");
            b1[i].Price = sc.next();

            System.out.println();
        }   
        for(int i=0;i<5;i++)
        {
            try
            {
                System.out.println("ISBN_NO : "+b1[i].ISBN_NO);
                System.out.println("Title : "+b1[i].Title);
                System.out.println("Publisher : "+b1[i].Publisher);
                System.out.println("Price : "+b1[i].Price);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}