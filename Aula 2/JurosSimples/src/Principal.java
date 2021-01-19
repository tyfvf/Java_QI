import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter with the capital of loan");
        double capital = keyboard.nextDouble();
        System.out.println("Enter with the rate value of loan");
        double rate = keyboard.nextDouble();
        System.out.println("Enter with the period value of loan");
        double period = keyboard.nextDouble();  
        
        SimpleInterest si = new SimpleInterest(period, capital, rate);
        
        System.out.printf("The amount of interest is %.2f\n",si.getInterest());
        System.out.printf("The total loan amount is %.2f\n",si.amountCalculator());
    }
    
}
