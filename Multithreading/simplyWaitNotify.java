public class simplyWaitNotify {
    boolean isdone= false;
    public synchronized void  SendSignal(){
        isdone= true;
        System.out.println("Creating the product ");
        notify();
    }

    public synchronized void iswaiting(){
        while(!isdone){
            try{
                wait();
                System.out.println("waiting for data");
            }catch(InterruptedException ex){

            }
            System.out.println("produced the data");
        }
    }

    public static void main(String[] args) {
        simplyWaitNotify obj= new simplyWaitNotify();
         Thread t2 =new Thread( ()->{
            obj.iswaiting();
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){

            }
        });

       
         Thread t =new Thread( ()->{
            obj.SendSignal();
        });
       t2.start();
       t.start();
    }

}


