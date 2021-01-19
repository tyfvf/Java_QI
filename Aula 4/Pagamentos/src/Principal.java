
import java.util.Scanner;


public class Principal {

   
    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Emter with the value of buy");
        double buyValue =  keyboard.nextDouble();
        
        System.out.println("Enter the amount paid by the customer");
        double amountPaid = keyboard.nextDouble();
        
        Payment payment = new Payment(buyValue,amountPaid);
        
        System.out.println("Enter of payment method");
        System.out.println("1 - Money");
        System.out.println("2 - Debit Card");
        System.out.println("3 - Credit Card");
        
        int option = keyboard.nextInt();
        
        switch(option){
            case 1:
                double subtotal = payment.moneyPayment();
                if(subtotal > 0){
                    System.out.printf("The money change of the customer is %.2f\n",subtotal);
                }else{
                    System.out.printf("The subtotal of buy is %.2f\n",subtotal);
                }
            break;
            
            case 2:
                if(payment.debitCardPayment()){
                    System.out.println("Sucess!");
                }else{
                    System.out.println("Not autorized!");
                }
            break;
            
            case 3:
                System.out.println("Enter of number of intallments");
                int intallments = keyboard.nextInt();
                if(payment.creditCardPayment(intallments)){
                    System.out.println("Sucess!!");
                }else{
                    System.out.println("Not autorized!!!");
                }
            break;
            
            default:
                
            break;    
        }
    }
    
}
