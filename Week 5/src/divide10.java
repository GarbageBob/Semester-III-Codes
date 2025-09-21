import java.util.Scanner;

public class divide10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number greater than 10: ");
        int n = s.nextInt();
        if (n<10){
            System.out.println("INVALID NUMBER! ENTER NUMBER GREATER THAN 10");
        }
        else{
            while (n>10){
                System.out.println(n);
                n /=2;
            }
        }
    }

}
