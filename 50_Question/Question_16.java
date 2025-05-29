public class Question_16 {
     public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; 
        int n = 6;
        int missing = findMissingNumber(arr, n);
        System.out.println("Missing number is: " + missing);
    }
}
