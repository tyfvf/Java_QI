import java.util.Scanner;

public class Principal {
 public static void main (String[] args){
     Scanner teclado = new Scanner(System.in);
     System.out.println("Digite o primeiro número: ");
     double numberOne = teclado.nextDouble();
     System.out.println("Digite o segundo número: ");
     double numberTwo = teclado.nextDouble();
     
     Calculadora calc = new Calculadora();
     calc.number1 = numberOne;
     calc.number2 = numberTwo;
     
     double sum = calc.Sum();
     System.out.println("The  sum your number is: "+sum);
     
     double subtraction = calc.Subtraction();
     System.out.println("The  sum your number is: "+subtraction);
     
     double multi = calc.Multiply();
     System.out.println("The  sum your number is: "+multi);
     
     double division = calc.Divider();
     System.out.println("The  sum your number is: "+division);
 }    
 }
