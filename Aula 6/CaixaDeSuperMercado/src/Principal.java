import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        double price;
         SomaProduto calc = new SomaProduto();
        do{
            Scanner keyboard = new Scanner(System.in);
        
            System.out.println("What´s the value of the product ?");
            price = keyboard.nextDouble();
            calc.AddItem(price);
          
        
        }while(price !=0 );
        
        System.out.printf("Your subtotal is R$ %.2f\n",calc.getSubtotal() );
        
      
    }
    
}
