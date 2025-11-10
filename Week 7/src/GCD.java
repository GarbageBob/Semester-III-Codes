public class GCD {

    public static int GCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a % b);
    }

    public static void main(String[] args) {
        int a = 32;
        int b = 64;
        int gcd = GCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
}
