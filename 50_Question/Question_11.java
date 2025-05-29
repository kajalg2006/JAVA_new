public class Question_11 {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int posCount = 0, negCount = 0;

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[posCount++] = arr[i];
            } else {
                neg[negCount++] = arr[i];
            }
        }

        int i = 0, p = 0, ng = 0;

        // Alternate positive and negative
        while (p < posCount && ng < negCount) {
            arr[i++] = pos[p++];
            arr[i++] = neg[ng++];
        }

        // If positives left
        while (p < posCount) {
            arr[i++] = pos[p++];
        }

        // If negatives left
        while (ng < negCount) {
            arr[i++] = neg[ng++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        rearrange(arr);

        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
