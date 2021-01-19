import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please my friend, enter with your temperature in °C");
        double celsius = keyboard.nextDouble();
        
        Converter c = new Converter();
        
        double fahrenheit = c.FahrenheitConverter(celsius);
        
               
        
        double kelvin = c.KelvinConverter(celsius);
        
        
        double rankine = c.RankineConverter(celsius);
        
        //Mostrar os dados para usuário
        System.out.printf("Fahrenheit is %.2f °F\n",fahrenheit);
        
        System.out.printf("Kelvin is %.2f K\n",kelvin);
        
        System.out.printf("Rankine is %.2f \n",rankine);
    }
        
    
}