package Map;

import java.util.HashMap;

public class G {
    public static void main(String[] args) {
     String str= "aaaabbbbbcccddeeef";
     HashMap<Character, Integer> map= new  HashMap<>();

        char[] arr= str.toCharArray();
   
        for(char i : arr){
      map.put(i,map.getOrDefault(i, 0)+1);
       }

      
              for(char i : arr){
                if (map.get(i)==1) {
                  System.out.println(i);
                  break;
                }
              }     
     
  }
}
