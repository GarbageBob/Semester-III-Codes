public class Palindrome {
    public static void main(String[] args) {
        int num = 23032;
        int reversed = 0;
        int remainder;
        int originalNum;

        originalNum = num;

        while(num != 0){
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            System.out.println(reversed);
            num /= 10;
        }

        if(originalNum == reversed){
            System.out.println(originalNum + " is a palindrome.");
        }
        else{
            System.out.println(originalNum + " is not a palindrome.");
        }
    }

}
