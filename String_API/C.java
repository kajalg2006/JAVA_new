//return a list of uppercase which have more than 3 characters

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class C {
     public static void main(String[] args) {
        List<String> name= Arrays.asList("Ram","sita","Om","Shyam","Ram");
        List<String> newList= name.stream().filter(list->list.length()>3).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(newList);
    }
}
