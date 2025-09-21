public class ReverseDigits {
    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reversed number: " + reverseDigits(num));
    }
}