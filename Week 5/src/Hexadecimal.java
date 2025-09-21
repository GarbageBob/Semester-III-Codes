import java.util.Scanner;

public class Hexadecimal {
    public static String decToHex(int num) {
        String hex = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        num = sc.nextInt();
        while (num > 0) {
            int remainder = num % 16;
            if (remainder < 10)
                hex = remainder + hex;
            else
                hex = (char)(remainder - 10 + 'A') + hex;
            num /= 16;
        }
        return hex;
    }

    public static int hexToDec(String hex) {
        int num = 0;
        int power = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        hex = sc.next();
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            if (ch >= 'A' && ch <= 'F')
                num += (ch - 'A' + 10) * Math.pow(16, power);
            else
                num += (ch - '0') * Math.pow(16, power);
            power++;
        }
        return num;
    }


    public static void main(String[] args) {
        System.out.println(decToHex(15));
        System.out.println(hexToDec("F"));
    }
}