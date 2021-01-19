import java.util.Calendar;
import java.util.Scanner;

public class Principal{
    
    public static void main(String[] args) {
        //Instancias de objetos
        Calendar cal = Calendar.getInstance();
        Scanner keyboard = new Scanner(System.in);
        
        int Year = cal.get(Calendar.YEAR);
        System.out.println("Digite seu ano de nascimento: ");
        
        int yearOfBirthDay = keyboard.nextInt();
        int age = Year - yearOfBirthDay;
        
       //System.out.println("Sua idade atual é: "+age+" anos");
        
        //Impressão formatada - alternativa
        
        System.out.printf("Sua idade é de %d anos\n", age);
    }
    
}
