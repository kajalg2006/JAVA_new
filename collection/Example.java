

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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


    // public static void main(String[] args) {
    //     ArrayList<String> list =new ArrayList<>();
    //     list.add("kajal");
    //     list.add("priyanshi");
    //     list.add("priya");
    //     list.add("pa");
        
    //     ListIterator<String> it= list.listIterator();
    //       while(it.hasNext()){
    //         String data= it.next();
    //         if(data.length()<=3){
    //           it.set("bye");
    //         }
            
    //     }
    //     System.out.println(list);
        
    //     //  int index = ((ArrayList<String>) it).size()-1;
    //     while(it.hasPrevious()){
    //         String PrevData =it.previous();
    //         if(it.nextIndex()==0){
                
    //         }
    //         else{
    //             it.set("hello");
    //         }
    //     }
    //     System.out.println(list);
    // }
    

  
public static void main(String[] args) {
    ArrayList<Student> list= new ArrayList<>();
    list.add(new Student(123,"kajal",20));
    list.add(new Student(124,"priya",20));
    list.add(new Student(125,"priyanshi",20));
    Collections.sort(list,new SortByname());
    for(Student s:list){
        System.out.println(s);
    }
    Collections.sort(list,new sortByrollNo());
    for(Student s:list){
        System.out.println(s);
    }
}
   



}
class SortByname implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class sortByrollNo implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return Integer.compare(s2.rollNo,s1.rollNo);
    }
}


class Student{
    int rollNo;
    String name;
    int age;


    Student(int rollNo, String name, int age){
        this.name=name;
        this.age= age;
        this.rollNo= rollNo;
    }

    
    public String toString(){
        return  name +" "+age+" "+rollNo;
    }
}
