class Question_02 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 7, 4, 6, 9 };
        int s= 0;
        int e= arr.length-1;
        while(s<e){
           int temp= arr[s];
           arr[s]=arr[e];
           arr[e]= temp;

           s++;
           e--;
        }
        for(int i=0;i<arr.length;i++ ){
            System.out.println(arr[i]);
        }
    }
}
