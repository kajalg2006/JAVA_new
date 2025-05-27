

public class this1 {
    void sum(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        this1 obj = new this1();
        System.out.println(obj);
        obj.sum();
       }
}
