import java.util.Scanner;
public class Principal {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter with a time of employee in your company");
        int timeOfCompany = keyboard.nextInt();
        
        Pessoa p = new Pessoa();
        p.salary = 1500;
        p.readjustmentsSalary(timeOfCompany);
        System.out.printf("Salary of time employee is %.2f",p.salary);
        
    }
    
}
