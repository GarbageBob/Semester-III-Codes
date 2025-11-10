public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    int smallest = a;
    if (b < smallest) {
        smallest = b;
    }
    if (c < smallest) {
        smallest = c;
    }
    if (d < smallest) {
        smallest = d;
    }
    System.out.println("Smallest number is " + smallest);
}
