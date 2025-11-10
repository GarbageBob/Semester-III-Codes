public static void main(String[] args) {
    String str1 = "Listen";
    String str2 = "Silent";
    char[] char1 = str1.toLowerCase().toCharArray();
    char[] char2 = str2.toLowerCase().toCharArray();
    Arrays.sort(char1);
    Arrays.sort(char2);
    if (Arrays.equals(char1, char2)) {
        System.out.println("The strings are anagrams of each other");
    } else {
        System.out.println("The strings are not anagrams of each other");
    }
}
