 class Question_01 {
    public static void main(String[] args) {
        int arr[] = {2,3,7,4,6,9};

        int max= arr[0];

        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println(max);
        int min= arr[0];

        for(int i = 1; i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println(min);

        
    }
}
