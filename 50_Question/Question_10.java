public class Question_10 {
    public static int[] findLeaders(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; 
        int count = 0;

        int maxFromRight = arr[n - 1];
        temp[count++] = maxFromRight; 

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                temp[count++] = maxFromRight;
            }
        }

        
        int[] leaders = new int[count];
        for (int i = 0; i < count; i++) {
            leaders[i] = temp[count - i - 1];
        }

        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] leaders = findLeaders(arr);

        System.out.print("Leaders: ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
