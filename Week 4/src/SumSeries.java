import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the series is " + sum);
    }
}
