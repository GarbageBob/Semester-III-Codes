import java.util.Scanner;
public class reciprocalsum {
    public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter N:");
        n = s.nextInt();
        for (float i=1; i<=n; i++)
        {
            sum += 1/i;
            if (i!=n){
            System.out.print("1/"+(int)i+" + ");
            }
            else{
                System.out.print("1/"+n);
                System.out.println();
            }
        }
        System.out.println("The sum of the series is "+sum);

    }
}
