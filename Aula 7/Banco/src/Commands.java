import java.lang.Math;
public class Commands {
    private double balance = 200.0;
    private double limit = 400.0;
    private double valueOfWithdrawn;
    private double valueOfDeposit;
    
    private double limit2 = 400.0;
    private double balance2 = 400.0;
    
    
    
    public Commands(){
       this.valueOfWithdrawn = 0.00;
       this.valueOfDeposit = 0.00;
    }
    
    
    public void withdrawn(double valueOfWithdrawn){
        double availableValue = balance + limit ;
        
        if(valueOfWithdrawn <= balance){
            balance -= valueOfWithdrawn;
            System.out.println("Withdrawn make with sucess!!");
        }
        else if(valueOfWithdrawn <= availableValue){
            balance = 0.00;
            limit = availableValue - valueOfWithdrawn ;
            System.out.println("Withdrawn make with sucess!!");           
        }
        else{
            System.out.println("Value not available!!");
            System.out.println("You can only withdrawn $"+ availableValue);
        }
        
        showBalance();
    }
    
     public void Deposit(double valueOfDeposit){
         if(valueOfDeposit>=10){
             balance += valueOfDeposit;
             showBalance();
         }
         else{
             System.out.println("Enter a higher value");
         }
     } 
    
    public void showBalance(){
        System.out.printf("Your balance is $ %.2f\n",balance);
        System.out.printf("Your limit is $ %.2f\n",limit);
    }
    
    public void Loan (double valueOfLoan, int months){
        double totalLoan = valueOfLoan*Math.pow(1.02,months);
        double loanTaxes = totalLoan - valueOfLoan;
        balance += totalLoan;
        
        System.out.println("Loan made with sucess!!");
        System.out.println("-------------------------");
        System.out.printf("You gonna pay $ %.2f in taxes\n",loanTaxes);
        System.out.printf("You gonna pay $ %.2f in total\n",totalLoan);
        
        showBalance();
            
    }
    
    public void Transfer(double valueOfTransfer){
        double availableValue = balance + limit ;
        
        if(valueOfTransfer <= balance){
            balance -= valueOfTransfer;
            System.out.println("transfer make with sucess!!");
            balance2 += valueOfTransfer;
            System.out.println("The balance of Joãozinho is " +balance2);
            
            
        }
        else if(valueOfTransfer <= availableValue){
            balance = 0.00;
            limit = availableValue - valueOfTransfer ;
            System.out.println("transfer make with sucess!!"); 
            balance2 += valueOfTransfer;
            System.out.println("The balance of Joãozinho is " +balance2);
        }
        else{
            System.out.println("Value not available!!");
            System.out.println("You can only transfer $"+ availableValue);
            
        }
        showBalance();
    }
    
    
}
