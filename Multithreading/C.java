public class C {
    public static void main(String[] args) {

    AThread a= new AThread();
    a.start();
    System.out.println("hello");
   }
}
class AThread extends Thread{
    public void run(){

        System.out.println("ji");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){

        }
    }
}