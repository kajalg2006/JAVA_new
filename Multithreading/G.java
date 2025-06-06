// public class G {
//     public static void main(String[] args) {
//         Runnable r =new Runnable() {
//             public void run(){
//                 System.out.println("Runnable using Anonymous class");
//             }
//         };
//         r.run();
//     }
// }

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class G{
    public static void main(String[] args) {
        ArrayList<String> list = new  ArrayList<>();
        list.add("rahul");
        list.add("rupesh");
        list.add("pankaj");
        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println(list);
   }
}
