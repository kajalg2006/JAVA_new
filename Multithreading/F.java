class Mythread extends Thread{
    public void run(){
       for(int i =0; i<=5;i++){
        System.out.println(getName()+"is running with priority ..."+ getPriority());
        Thread.yield();
       }
    }
}
public class F {
    public static void main(String[] args) {
        Mythread t1= new Mythread();
        Mythread t2= new Mythread();

        t1.start();
        t2.start();

        t1.setName("A");
        t2.setName("B");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
    }
}
