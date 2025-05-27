

public class B {
public static void main(String[] args) {
    int[] arr= {1,2,3,4,5};
    int k=1;
    int[]  arr1 = new int[arr.length];

    for(int i =0; i<arr.length;i++){
            arr1[(i+k)%arr.length]=arr[i];
        }
        arr= arr1;

    

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
  }
}
