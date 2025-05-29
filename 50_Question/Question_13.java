public class Question_13 {
     public static void findPairs(int[] arr, int targetSum) {
        int n = arr.length;
        System.out.println("Pairs with sum " + targetSum + ":");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;
        findPairs(arr, targetSum);
    }
}
