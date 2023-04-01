import java.util.*;
interface area_interface
{
    void rectangle();
    void triangle();
    void square();
}
public class area implements area_interface
{
    Scanner sc = new Scanner(System.in);
    public void rectangle()
    {
        System.out.print("Enter The Width Of Rectangle : ");
        int width = sc.nextInt();
        System.out.print("Enter The Length Of Rectangle : ");
        int height = sc.nextInt();
        int area_rect = width*height;
        System.out.println("area of rectangle : "+area_rect);
        System.out.println();
    }   
    public void triangle()
    {
        System.out.print("Enter The Base Of Triangle : ");
        int width = sc.nextInt();
        System.out.print("Enter The Height Of Rectangle : ");
        int height = sc.nextInt();
        int area_tri = (width*height)/2;
        System.out.println("area of triangle : "+area_tri);
        System.out.println();
    }
    public void square()
    {
        System.out.print("Enter The Side Of Square : ");
        int side = sc.nextInt();
        int area_sqr = side*side;
        System.out.println("area of Square : "+area_sqr);
        System.out.println();
    }
    public static void main(String[] args) 
    {
        area a1 = new area();
        a1.rectangle();
        a1.triangle();
        a1.square();    
    }
}