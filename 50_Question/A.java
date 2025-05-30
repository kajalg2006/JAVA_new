
// print the array zeros first then negative then positive
class A {
    public static void main(String[] args) {
        int arr1[] ={2,3,-1,0,0,7};
        int arr2[]= new int[arr1.length];
 


        int j=0;

        for(int  i = 0; i<arr1.length;i++){
            if(arr1[i]==0){
                arr2[j] =0;
                j++;
            }
        }
        for(int  i = 0; i<arr1.length;i++){
            if(arr1[i] <0){
                arr2[j] =arr1[i];
                j++;
            }
        }
        for(int  i = 0; i<arr1.length;i++){
            if(arr1[i]>0){
                arr2[j] =arr1[i];
                j++;
            }
        }


        
    }
}
