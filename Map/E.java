
package Map;
import java.util.HashMap;

public class E {
    public static void main(String[] args) {
    String str = "Programming";

    HashMap<Character, Integer> map= new  HashMap<>();
    // map.put("id",1);
    // System.out.println(map.get("name"));
    // System.out.println(map.getOrDefault("Id",0) );
 
    char[] arr= str.toCharArray();
    for(char i : arr){
      map.put(i,map.getOrDefault(i, 0)+1);
    }

    System.out.println(map);
  }
}
