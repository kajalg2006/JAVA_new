public class Question_04 {
     public static void rearrange(int[] arr) {
        int j = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 4};

        rearrange(arr);

        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
