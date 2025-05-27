class Question_03 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 7, 4, 6, 9 };
        int k=3;
        int prevMax = Integer.MAX_VALUE;
        int kthMax = -1;
        
        for (int j = 1; j <= k; j++) {
             int currentMax = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < prevMax &&  arr[i] > currentMax) {
                    currentMax = arr[i];
                }
            }
             prevMax = currentMax;
             kthMax = currentMax;
        }
         System.out.println("The " + k + "th maximum element is: " + kthMax);
    }
}


