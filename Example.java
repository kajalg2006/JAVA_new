import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

//public class Example {
    // public static void main(String[] args) {
        
    //     LinkedList<Integer> arr= new LinkedList<>();
    //     long start = System.nanoTime();
    //     arr.add(5);

    //     System.out.println(arr.contains(5));
    //     long end = System.nanoTime();
    //     System.out.println(end-start);

    // }

 // public static void main(String[] args) {
    
    //   TreeSet<String> set =new TreeSet<>();
    //   set.add("C");
    //   set.add("B");
    //   set.add("A");
    //   set.add("a");
    //   System.out.println(set);
      
    //   TreeSet<String> set2 =new TreeSet<>();
    //   set2.add("C");
    //   set2.add("B");
    //   set2.add("A");
    //   set2.add("a");
    //   System.out.println(set);





     // First duplicate
    // int ar[]={1,2,2,3,42,4,5,53,45,3,5};
    // int count=0;
    //  HashSet<Integer> set= new HashSet<>();
    //  set.add(ar[0]);
    //  for(int i =1; i<ar.length;i++){
        
    //      if(set.contains(ar[i])){
    //          System.out.println(" first duplicate number is "+ar[i]);
    //          break;
    //         }
    //         set.add(ar[i]);
          
    //  }
    // System.out.println(set);


//       HashMap<String, Integer> map = new HashMap<>();
//       map.put("id0",2 ); 
//       map.put("id1",1);
//       map.put("id2",3);
//       System.out.println(map);
//       System.out.println(map.containsKey("id0"));
//       System.out.println(map.containsValue(1));
//       // System.out.println(map.remove(map));

//       for(String key: map.keySet()){
//         System.out.println(key);
//       }
      


      
//     }
// }


// class Example{
//   public static void main(String[] args) {
//     String str = "Programming";

//     HashMap<Character, Integer> map= new  HashMap<>();
//     // map.put("id",1);
//     // System.out.println(map.get("name"));
//     // System.out.println(map.getOrDefault("Id",0) );
 
//     char[] arr= str.toCharArray();
//     for(char i : arr){
//       map.put(i,map.getOrDefault(i, 0)+1);
//     }

//     System.out.println(map);
//   }
// }



// Count words 
// class Example{
//   public static void main(String[] args) {
//     String str1= "programming is fun and fun is  programming";

//     String[] arr= str1.split(" ");

//     HashMap<String, Integer> map= new  HashMap<>();

//     for(String word: arr){
//        map.put(word,map.getOrDefault(word, 0)+1);
//     }

//     for(String word: map.keySet()){
//       System.out.print(word + " "+ map.get(word));
//     }
// // output
// //      1
// // and 1
// // is 2
// // programming 2
// // fun 2
//   }
// }


class Example{
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

