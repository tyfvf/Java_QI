import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter with the first number");
        double firstNumber = keyboard.nextDouble();
        System.out.println("Enter with the second number");
        double secondNumber = keyboard.nextDouble();
        
        Calculator calc = new Calculator(firstNumber, secondNumber);
        
        System.out.printf("The sum is %.2f\n",calc.sum());
        
        calc.setNumber1(255);
        
        System.out.printf("Now the sum is %.2f\n",calc.sum());
    }
           
}
