public class Question_15 {
    public static void findSubarrayWithSum(int[] arr, int S) {
        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            // Shrink window from left if sum is more than S
            while (currentSum > S && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if currentSum equals S
            if (currentSum == S) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray with given sum found");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int S = 12;
        findSubarrayWithSum(arr, S);
    }
}
