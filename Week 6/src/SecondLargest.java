public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 2, 9, 7, 5, 1, 8, 3, 6};
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second largest element is " + secondMax);
    }
}
