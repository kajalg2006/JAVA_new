// return lit of squares of only even numbers

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class B {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,2,20,25);
        List<Integer> evenlist= list.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println(evenlist);
    }
    
}
