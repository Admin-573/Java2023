import java.util.Scanner;
class Mobile {
    private int m_code;
    private String company_name;
    private String mobile_name;
    private float price;

    public void setValues(int code, String company, String name, float price) {
        m_code = code;
        company_name = company;
        mobile_name = name;
        this.price = price;
    }

    public void displayMobileDetails() {
        if (price < 7000) {
            System.out.println("Mobile Code: " + m_code);
            System.out.println("Company Name: " + company_name);
            System.out.println("Mobile Name: " + mobile_name);
            System.out.println("Price: " + price);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of mobiles: ");
        int N = scanner.nextInt();

        Mobile[] mobiles = new Mobile[N];

        for (int i = 0; i < N; i++) {
            mobiles[i] = new Mobile();

            System.out.print("Enter Mobile Code: ");
            int code = scanner.nextInt();
            System.out.print("Enter Company Name: ");
            String company = scanner.next();
            System.out.print("Enter Mobile Name: ");
            String name = scanner.next();
            System.out.print("Enter Price: ");
            float price = scanner.nextFloat();

            mobiles[i].setValues(code, company, name, price);
        }

        System.out.println("Mobiles with Price less than 7000:");
        for (int i = 0; i < N; i++) {
            mobiles[i].displayMobileDetails();
        }
    }
}