import java.util.Scanner;

public class AreaDoCirculo {


   
    public static void main(String[] args) {
        double raio;
       do{
       Scanner keyboard = new Scanner(System.in);
       System.out.println("What's the value of the radius? ");
        
       raio = keyboard.nextDouble();
       Area calc = new Area(raio);
       System.out.printf("Your value of the area is %.2f: \n",calc.CalculoArea());
    }while(raio!=0);
       
       
       
       
    }
    
}
