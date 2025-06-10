import java.util.*;

class CreateBankAccount {
    private static int accountCounter = 10000000;
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private List<String> transactionHistory;

    public CreateBankAccount(String name) {
        this.accountHolderName = name;
        this.accountNumber = ++accountCounter;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: 0.0");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + ", New Balance: " + balance);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + ", New Balance: " + balance);
            System.out.println("Withdrawal successful.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public List<String> getTransactionHistory(){
        return  transactionHistory;
    }
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public static int getAccountcounter(){
        return accountCounter;
    }
    public static void setAccountcounter(int accountCounter){
        CreateBankAccount.accountCounter= accountCounter;
    }

}

class BackAccount {
    private static Scanner scanner = new Scanner(System.in);
     private static Map<Integer, CreateBankAccount> accounts = new HashMap<>();
     private static CreateBankAccount currentAccount = null;
    
    private static CreateBankAccount account;
    public static CreateBankAccount  getAccount(){
        return account;
    }
    public static void aetAccount(CreateBankAccount account)
 {
      BackAccount.account= account;
      accounts.put(account.getAccountNumber(), account);
}
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Transaction History");
            System.out.println("6. Login to Existing Account");
            System.out.println("7. Logout");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    account = new CreateBankAccount(name);
                    System.out.println("Account created! Your account number is: " + account.getAccountNumber());
                    break;
                case 2:
                    if (account != null) {
                        System.out.println("Current Balance: " + account.getBalance());
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 3:
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 5:
                    if (account != null) {
                        account.printTransactionHistory();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 6:
                    System.out.println("Login to Existing Account");
                    System.out.println("Enter your account");
                    System.out.println("Enter your account number:");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();
                    if(accounts.containsKey(accountNumber)){
                        currentAccount = accounts.get(accountNumber);
                        System.out.println("Logged in successfully as " + currentAccount.getAccountHolderName());
                    } else {
                        System.out.println("Account number not found.");
                    }

                    case 7:
                    if(currentAccount != null){
                        System.out.println("Logged out successfully.");
                        currentAccount= null;
                    }else{

                    System.out.println("No account is currently logged in.");

                    }
                    break;

                case 8:
                    System.out.println("Thank you for using the banking system!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
