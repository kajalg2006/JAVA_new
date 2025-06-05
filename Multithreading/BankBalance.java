public class BankBalance {
    
}
class Account extends Thread {
  

    static int Total_balance = 1000;
    int withdraw;
    static boolean iswithdrawing= true;

    Account(int withdraw) {
        this.withdraw = withdraw;
    }

    public void run() {
        
        if (Total_balance >= withdraw) {
            System.out.println("going to withdraw money " + withdraw);
        
         

            Total_balance = Total_balance - withdraw;
            System.out.println("Total_balance " + Total_balance);
        } else {
          
            System.out.println(Total_balance);

        }
    }
}
 
 

 
    class D {
    public static void main(String[] args) {
        Account a = new Account(800);

       
        Account b = new Account(500);
        Thread t =new Thread( ()->{
            
        });
         a.start();
         b.start();
    }
 }
