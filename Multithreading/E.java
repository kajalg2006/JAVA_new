public class E {
    public static void main(String[] args) {
        Thread t1= new Thread( ()->{
          System.out.println("hello");
          try{
             Thread.sleep(3000);
          }catch(InterruptedException ex){

          }
          
        });

        Thread t2 =new Thread( ()->{
            System.out.println();
        });

        t1.start();
        t2.start();
    }
}
