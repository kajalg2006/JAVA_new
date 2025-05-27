class Student{
    String name = "kaju";
    int age =12;
    Student(String name, int age){
        name =name;
        age=age;
        System.out.println(name+age);
    }
}
public class constructor {
    public static void main(String[] args) {
        Student  obj = new Student("kajal",12) ;
        System.out.println(obj.name);
    }
}
