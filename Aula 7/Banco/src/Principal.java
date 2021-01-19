import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
        final int RIGHT_PASSWORD = 9876;
        int option;
        
        Scanner keyboard = new Scanner(System.in);
        Commands com = new Commands();
        
        System.out.println("Enter with your password!!");
        int password = keyboard.nextInt();
        
        if(password == RIGHT_PASSWORD){
            
        do{
        System.out.println("Choose your option:");
        
        System.out.println("1- Withdrawn");
        System.out.println("2- Deposit");
        System.out.println("3- Balance");
        System.out.println("4- Transfer");
        System.out.println("5- Loan");
        System.out.println("6- Exit");
        
        option = keyboard.nextInt();
        switch(option){
            case 1:
                System.out.println("What´s the value of the withdrawn");
                double valueOfWithdrawn = keyboard.nextDouble();
                com.withdrawn(valueOfWithdrawn);
                
            break;
            
            case 2:
                System.out.println("What's the value of the deposit?");
                double valueOfDeposit = keyboard.nextDouble();
                com.Deposit(valueOfDeposit);
                
            break;
            
            case 3:
                com.showBalance();
                
            break;
            
            case 4:
                System.out.println("How much money do you wanna to transfer to Joãozinho? ");
                double valueOfTransfer = keyboard.nextDouble();
                com.Transfer(valueOfTransfer);
            break;
            
            case 5: 
                System.out.println("How much of loan do you want?");
                double valueOfLoan = keyboard.nextDouble();
                System.out.println("In how many months do you want to pay?");
                int months = keyboard.nextInt();
                com.Loan(valueOfLoan, months);
            break;
            
            case 6:
                System.out.println("Thank you, come again");
            break;
            
            default:
                System.out.println("Enter a valid number");
            break;    
        }
        }while(option != 6);
        
        
        }else{
            System.out.println("Invalid password, please try again later!!!");
        }
        
    }
    
}
