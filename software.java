import java.util.*;
public class software
{
    String price,name;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        software[] sw = new software[10];
        for(int i=0;i<10;i++)
        {
            sw[i] = new software();
            System.out.print("Enter For Number "+(i+1)+" Software Name: ");
            sw[i].name = sc.next();
            System.out.print("Enter For Number "+(i+1)+" Software Price: ");
            sw[i].price = sc.next();
            System.out.println();
        }
        for(int i=0;i<10;i++)
        {
           try
           {
            Thread.sleep(1100);
            System.out.println("Software Name : "+sw[i].name);
            System.out.println("Software Price : "+sw[i].price);
            System.out.println();
           }
           catch(Exception e)
           {
            e.printStackTrace();
           }
        }
    }
}