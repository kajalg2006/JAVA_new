

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example {
    //List iterator
    // public static void main(String[] args) {
        
        
    //     ArrayList<String> list =new ArrayList<>();
    //     list.add("kajal");
    //     list.add("priyanshi");
    //     list.add("priya");
    //     list.add("palak");

    //     System.out.println(list);
    //     Iterator<String> it= list.iterator();
    //     while (it.hasNext()) {
    //         String data= it.next();
    //         if(data.startsWith("P")){
    //              it.remove();
    //         }
    //     }
    //     System.out.println(list);

    // }


    // public static void main(String[] args) {
    //     ArrayList<String> list =new ArrayList<>();
    //     list.add("kajal");
    //     list.add("priyanshi");
    //     list.add("priya");
    //     list.add("palak");

    //     ListIterator<String> it= list.listIterator();
    //     while(it.hasNext()){
    //         String data= it.next();
    //         System.out.println(data);

    //     }
    //     System.out.println("something different ");

    //     while(it.hasPrevious()){
    //         String PrevData =it.previous();
    //         System.out.println(PrevData);
    //     }
    // }


    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("kajal");
        list.add("priyanshi");
        list.add("priya");
        list.add("pa");
        
        ListIterator<String> it= list.listIterator();
          while(it.hasNext()){
            String data= it.next();
            if(data.length()<=3){
              it.set("bye");
            }
            
        }
        System.out.println(list);
        
        //  int index = ((ArrayList<String>) it).size()-1;
        while(it.hasPrevious()){
            String PrevData =it.previous();
            if(it.nextIndex()==0){
                
            }
            else{
                it.set("hello");
            }
        }
        System.out.println(list);
    }







}
