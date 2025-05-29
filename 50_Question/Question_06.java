public class Question_06 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        // ----- UNION -----
        int[] union = new int[arr1.length + arr2.length];
        int k = 0;

        
        for (int i = 0; i < arr1.length; i++) {
            union[k++] = arr1[i];
        }

        
        for (int i = 0; i < arr2.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[k++] = arr2[i];
            }
        }

        System.out.print("Union: ");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println();

        // ----- INTERSECTION -----
        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean alreadyPrinted = false;
                    for (int m = 0; m < i; m++) {
                        if (arr1[m] == arr1[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(arr1[i] + " ");
                    }
                    break;
                }
            }
        }
    }
}


