public class DigitSum {
    public static void main(String args[])
    {
        int n = 629481, sum = 0, temp;
        while (n>0)
        {
            temp = n%10;
            sum += temp;
            n/=10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }

}
