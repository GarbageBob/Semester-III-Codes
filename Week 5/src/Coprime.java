import java.util.Scanner;

public class Coprime {
    public static int GCD(int a, int b)
    {
        if (b == 0)
            return a;
        else
        {
            return GCD(b, a%b);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter the second number:");
        int n2 = sc.nextInt();
        int gcd = GCD(n1, n2);
        if (gcd == 1)
        {
            System.out.println("The numbers are coprime!");
        }
        else
        {
            System.out.println("The numbers are not coprime!!");
        }
    }

}
