public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 4};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element is " + max);
        System.out.println("Minimum element is " + min);
    }
}
