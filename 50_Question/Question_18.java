public class Question_18 {
    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int gap = (m + n + 1) / 2; // initial gap

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < (m + n)) {
                // Get elements to compare: from arr1 or arr2
                int a = (i < m) ? arr1[i] : arr2[i - m];
                int b = (j < m) ? arr1[j] : arr2[j - m];

                if (a > b) {
                    // Swap elements
                    if (i < m && j < m) {
                        // both in arr1
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    } else if (i < m && j >= m) {
                        // i in arr1, j in arr2
                        int temp = arr1[i];
                        arr1[i] = arr2[j - m];
                        arr2[j - m] = temp;
                    } else {
                        // both in arr2
                        int temp = arr2[i - m];
                        arr2[i - m] = arr2[j - m];
                        arr2[j - m] = temp;
                    }
                }

                i++;
                j++;
            }

            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};
        int m = arr1.length;
        int n = arr2.length;

        merge(arr1, arr2, m, n);

        System.out.print("After merging:\narr1: ");
        for (int num : arr1) System.out.print(num + " ");
        System.out.print("\narr2: ");
        for (int num : arr2) System.out.print(num + " ");
    }
}
