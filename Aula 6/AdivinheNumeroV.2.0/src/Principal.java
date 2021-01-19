import java.util.Scanner;
public class Principal {

    
    public static void main(String[] args) {
        double number;
        Scanner keyboard = new Scanner(System.in);
        
        
        do{
            System.out.println("2 * X = 16");
            System.out.println("what variable is missing?  ");
            number =keyboard.nextDouble();
            if( number < 8){
                System.out.println("It´s cold"); 
                System.out.println("try other number");
            }else if(number> 8){
                System.out.println("It´s hot");
                System.out.println("try other number");
            
          }}while(number != 8);
          
          System.out.println("You are right!!!");
               
        }
        
    
    }
    

