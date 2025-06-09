import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class F {
  public static void main(String[] args) {
      List<Integer> list= Arrays.asList(500,1000,1000,1500,2000);
      int sum= list.stream().filter(n->n>1000).reduce(0,Integer::sum );
      System.out.println(sum);
         
  }    
}
