import java.util.List;

class CreateBankAccount{
    private static int accountCounter=1000;
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private List<String> transactionHistory;

    CreateBankAccount(String name){
       this.accountHolderName=name;
       this.accountNumber=++accountCounter;
       this.balance=0.0;
       this.transactionHistory=new java.util.ArrayList<>();
       transactionHistory.add("Account created with balance: 0.0");
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;  
     }
     public void deposit(double amount){
        if(amount>0){
            balance += amount;
            transactionHistory.add(accountHolderName + "deposited: " + amount + ", New Balance:");
            
        }
     }
}
class Bank {
    
}
