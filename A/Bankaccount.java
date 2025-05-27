public class Bankaccount {
    String bankaccount_number;
    String account_holder;
    int  balance;

   void createaccount(String bankaccount_number, String account_holder, int balance){
        this.bankaccount_number= bankaccount_number;
        this.account_holder = account_holder;
        this.balance = balance;
   }
    void deposit(int i){
       balance =balance+i;
        System.out.println(balance);
    }

    void withdraw(int amount){
        balance = balance-amount;
        System.out.println(balance);
    }
    public static void main(String[] args) {
        Bankaccount a= new Bankaccount();
        createaccount("100A", "kajal", 1000);
    }

}
