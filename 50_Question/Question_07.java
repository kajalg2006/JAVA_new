import java.util.Arrays;

public class Question_07 {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateByOne(arr);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
