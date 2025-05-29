public class Question_12 {
    public static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4, 5};
        int element = 2;
        int occurrences = countOccurrences(arr, element);
        System.out.println(element + " occurs " + occurrences + " times.");
    }
}
