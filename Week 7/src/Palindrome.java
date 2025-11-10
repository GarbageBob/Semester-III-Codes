public static void main(String[] args) {
    String str = "racecar";
    int len = str.length();
    boolean isPalindrome = true;

    for (int i = 0; i < len / 2; i++) {
        if (str.charAt(i) != str.charAt(len - i - 1)) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println(str + " is a palindrome");
    } else {
        System.out.println(str + " is not a palindrome");
    }
}
