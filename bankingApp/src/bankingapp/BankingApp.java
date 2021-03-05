package bankingapp;
import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean loggedIn = false;
        boolean quit = false;
        
        while (!quit) {
            System.out.println("Enter a command:\n1. Log in\n2. Register\n3. Quit");
            String command1 = scan.next();
            if ("1".equals(command1)) {
                
                
                while (loggedIn) {
                    System.out.println("Enter a command:\n1. Check balance\n2. Deposit\n3. Withdraw\n4. Quit");
                    String command2 = scan.next();
                    if ("1".equals(command2)) {
                        
                    }
                }
            
            
            } else if ("2".equals(command1)) {
                
            } else if ("3".equals(command1)) {
                quit = true;
            }
            
        }
    }
    
}
