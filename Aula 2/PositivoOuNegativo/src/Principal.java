import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's the number?");
        double number = keyboard.nextDouble();
        Valuator v = new Valuator(number);
        
        
        
    }
    
}
