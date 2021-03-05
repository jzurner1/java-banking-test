package bankingapp;

public class Account {
    public String userFirstName;
    public String userLastName;
    public String username;
    public String password;
    public double balance;
    
    
    public void printBalance() {
        System.out.println("Current balance: $" + balance);
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " has been added to your account.");
        System.out.println("Current balance: $" + balance);
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " has been deducted from your account");
        } else {
            System.out.println("Not enough money in account!");
        }
    }
}
