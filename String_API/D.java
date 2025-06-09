import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

 class D {
      public static void main(String[] args) {
         List<Integer> list= Arrays.asList(5,10,2,20,25);
         
         Optional<Integer> newlist= list.stream().reduce((a,b)->a+b); 
        System.out.println(newlist);
    }
}
