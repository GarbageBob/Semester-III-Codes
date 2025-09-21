import java.util.Scanner;

public class TestPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int maxstars = 1 + (2 * (n - 1));
        for (int i = 1; i <= n; i++)
        {
            int stars = 1 + (2 * (i - 1));
            for (int j = 1; j <= maxstars - stars; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
