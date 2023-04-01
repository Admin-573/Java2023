import java.util.*;
public class items 
{
    String item_no;
    String item_name;
    String item_price;
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        items[] i1 = new items[10];
        for(int i = 0;i<10;i++)
        {
            i1[i] = new items();
            System.out.print("Enter Item Number For "+(i+1)+" : ");
            i1[i].item_no = sc.next();
            System.out.print("Enter Item Name For "+(i+1)+" : ");
            i1[i].item_name = sc.next();
            System.out.print("Enter Item Price For "+(i+1)+" : ");
            i1[i].item_price = sc.next();
            System.out.println();
        }
        System.out.println();
        System.out.println("Printing items At 2 Second !");
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(2000);
                System.out.println("Number : "+i1[i].item_no);
                System.out.println("Name : "+i1[i].item_name);
                System.out.println("Price : "+i1[i].item_price);
                System.out.println();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

}
