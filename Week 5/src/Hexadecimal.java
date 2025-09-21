public class Hexadecimal {
    public static String decToHex(int num) {
        String hex = "";
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
