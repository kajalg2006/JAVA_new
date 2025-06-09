import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class G {
    public static void main(String[] args) {
         List<String> name= Arrays.asList("Ram","Aita","Om","ahyam","am");
        long newList= name.stream().filter(s->s.toLowerCase().startsWith("a")).map(String::length).count();
        System.out.println(newList);
    }
}
