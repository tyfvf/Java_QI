import java.util.Scanner;

public class Principal {
    private static Scanner keyboard = new Scanner(System.in);
    private static ShopList list = new ShopList();
    public static void main(String[] args) {
    int option;   
     
        do{
        System.out.println("Escolha uma opção: ");
        
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Listar todos os itens");
        System.out.println("3 - Mostrar número de itens");
        System.out.println("4 - Mostrar subtotal");
        System.out.println("5 - sair");
        
        option = keyboard.nextInt();

        switch (option) {
            case 1:
                addItem();
                break;
            case 2:
                listItens();
                break;
            case 3:
                showCountItens();
                break;
            case 4:
                 subTotal();
            break;
            case 5:
                System.out.println("Volte sempre");
            break;
            
            default:
                System.out.println("Digite uma opção valida");
            break;
        }
        }while(option!=5);
    }

    private static void addItem() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite a descrição do produto");
        String description = keyboard.nextLine();
        System.out.println("Digite o preço do produto");
        float price = keyboard.nextFloat();
        System.out.println("Digite a quantidade do produto");
        int quantity = keyboard.nextInt();
        
        Product p = new Product(description, price, quantity);
        boolean sucess = list.addItem(p);
        
        if (sucess){
            System.out.println("Item adicionado com sucesso!");
            
        }else{
            System.out.println("Não foi possivel adicionar o item!");
        }
        
    }

    private static void listItens() {
        System.out.println("Itens na lista:");
        for(Product p: list.getList())
            System.out.printf("Você deseja comprar %d unidades do produto %s, no valor de %.2f UN.\n    "
                    , p.getQuantity(), p.getDescription(), p.getPrice());
        
    }

    private static void showCountItens() {
        int countItens = list.countItens();
        
        if(countItens>0){
            System.out.printf("\nAtualmente a lista possui %d itens\n",countItens);
        }else{
            System.out.println("Não há itens na lista");
        }
    }
    
    private static void subTotal(){
       double subTotal =0;
        for(Product p: list.getList())
           subTotal += p.getQuantity()*p.getPrice();
           
        
        System.out.println("Your subtotal is $ "+subTotal);
    }

}
