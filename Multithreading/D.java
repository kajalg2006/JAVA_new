class Account extends Thread {
    static int Total_balance = 1000;
    int withdraw;

    Account(int withdraw) {
        this.withdraw = withdraw;
    }

    public void run() {
        if (Total_balance >= withdraw) {
            System.out.println("goint to withdraw money " + withdraw);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }


            Total_balance = Total_balance - withdraw;
            System.out.println("Total_balance " + Total_balance);
        } else {
          
            System.out.println(Total_balance);

        }
    }

}

public class D {
    public static void main(String[] args) {
        Account a = new Account(800);
       
        Account b = new Account(500);
      
         a.start();
         b.start();
    }
}
