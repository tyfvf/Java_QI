import java.util.Scanner;

public class Principal {

       
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter with the limit of itens");
        int limitOfItens = keyboard.nextInt();
        
        Inventory iv = new Inventory(limitOfItens);
        
        // Adição de itens
        System.out.println("Enter with number of itens");
        int numberOfItens = keyboard.nextInt();
        boolean result = iv.addItem(numberOfItens);
        
        if(result){
            System.out.println("Item add with sucess!!");
    }
        else{
            System.out.println("Sorry, item not add in iventory. Limit exceeded");
        }
    
}
}
