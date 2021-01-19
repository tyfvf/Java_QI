import java.util.Calendar;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please, enter your birthday");
        String birthday = keyboard.next();
        String yearOfBirth = birthday.substring(6);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        
        int age = year - Integer.parseInt(yearOfBirth);
        
        if(age<=10){
            System.out.println("You are a baby!!!, you only have "+age+" years old");
        }
        else if(age <=15){
            System.out.println("You are a masturbator, you have " +age+ " years old");
        }
        else if(age <=20){
            System.out.println("Do you have a job?, it's time, you have " +age+ " years old");
        }
        else if(age >20 && age <=30)// OU --> ||
        {
            System.out.println("When you gonna marry?, you have " +age+ " years old");
        }
        else if(age<= 60){
            System.out.println("When you gonna die?, you already have " +age+ " years old");
        }
        else{
            System.out.println("You didn't die yet?, you have " +age+" years old!!!!");
        }
         
    }
            
}
