import java.util.ArrayList;

public class Question_17 {
    public static int[] intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Convert ArrayList to int array
        int[] intersect = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            intersect[k] = result.get(k);
        }
        return intersect;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        int[] intersect = intersection(arr1, arr2);
        System.out.print("Intersection: ");
        for (int num : intersect) {
            System.out.print(num + " ");
        }
    }
}
