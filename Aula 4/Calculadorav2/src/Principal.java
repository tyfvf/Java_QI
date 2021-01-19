import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);       
        System.out.println("Digite o primeiro número:");
        double numberOne = keyboard.nextDouble();
        System.out.println("Digite o segundo número:");
        double numberTwo = keyboard.nextDouble();
        
        Calculator calc = new Calculator(numberOne,numberTwo);
        
        System.out.println("Escolha uma operação");
        
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        
        int option = keyboard.nextInt();
        
        switch(option){
            case 1:
                //Soma
                System.out.printf("O resultado da soma é %.2f\n",calc.Sum());
            break;
                    
            case 2:
                //Subtrair
                System.out.printf("O resultado da subtração é %.2f\n",calc.Subtract());
            break;
            
            case 3:
                //Multiplicar
                System.out.printf("O resultado da multiplicação é %.2f\n",calc.Multiply());
            break;
            
            case 4:
                //Dividir
                System.out.printf("O resultado da divisão é %.2f\n",calc.Division());
            break;
            
            default:
                    System.out.println("Essa opção é invalida");
            break;
        }
       
        
    }
}
