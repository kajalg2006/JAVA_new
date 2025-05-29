public class Question_14 {
     public static int findDuplicate(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int num : arr) {
            if (visited[num]) {
                return num;
            }
            visited[num] = true;
        }
        return -1;  
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number is: " + findDuplicate(arr));
    }
}
