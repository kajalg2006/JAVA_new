package Map;
import java.util.HashSet;

public class C {
    public static void main(String[] args) {
          
    int ar[]={1,2,2,3,42,4,5,53,45,3,5};
    
     HashSet<Integer> set= new HashSet<>();
     set.add(ar[0]);
     for(int i =1; i<ar.length;i++){
        
         if(set.contains(ar[i])){
             System.out.println(" first duplicate number is "+ar[i]);
             break;
            }
            set.add(ar[i]);
          
     }
    System.out.println(set);
    }
}
