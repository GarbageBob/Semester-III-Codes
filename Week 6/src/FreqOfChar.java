public class FreqOfChar {
    public static void main(String[] args) {
        String str = "Welcome to Java";
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }
        for (int i = 0; i < 256; i++) {
            int count = freq[i];
            if (count != 0) {
                char ch = (char)i;
                System.out.println("Character '" + ch + "' occurs " + count + " times.");
            }
        }
    }
}
