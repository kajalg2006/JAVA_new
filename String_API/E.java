import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E {
    public static void main(String[] args) {
         List<String> name= Arrays.asList("Ram","sita","Om","Shyam","Ram");
          List<Integer> newList= name.stream().map(String::length).collect(Collectors.toList());
          System.out.println(newList);
    }
}
