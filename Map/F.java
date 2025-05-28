package Map;
import java.util.HashMap;
public class F {
    public static void main(String[] args) {
    String str1= "programming is fun and fun is  programming";

    String[] arr= str1.split(" ");

    HashMap<String, Integer> map= new  HashMap<>();

    for(String word: arr){
       map.put(word,map.getOrDefault(word, 0)+1);
    }

    for(String word: map.keySet()){
      System.out.print(word + " "+ map.get(word));
    }
}
}
