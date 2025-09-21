import java.util.Scanner;

public class threenotfive {
    public static void main(String[] args) {
        System.out.print("Enter the max number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=1; i<= n; i++){
            if (i%3 == 0 && i%5 != 0 ){
                System.out.println(i);
            }
        }
    }

}
