import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,2,20,25);
        // List<Integer> evenlist= list.stream().filter(n->n%2==0).map(n->n*5).collect(Collectors.toList());
        // System.out.println(evenlist);


        // Optional<Integer> newlist= list.stream().reduce((a,b)->a+b);
        // int sum= list.stream().reduce(0,(a,b)->a+b );
        // System.out.println(newlist);
        // System.out.println(sum);

        // int sum= list.stream().filter(n->n>2).filter(n->n%2==0).reduce(0,(a,b)->a+b );
        int sum= list.stream().reduce(5,(a,b)->a<b?a:b );
        int secondminimum=  list.stream().sorted((a,b)->a-b).skip(1).findFirst().orElse(Integer.MIN_VALUE);

        System.out.println(sum);
        System.out.println(secondminimum);
        
    }
}
