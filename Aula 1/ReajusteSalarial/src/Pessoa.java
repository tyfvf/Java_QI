
public class Pessoa {
    public String name;
    public double salary;
    
    //Reajustar salário
    public void readjustmentsSalary(int timeOfCompany){
        if(timeOfCompany >10){
            salary += salary * 0.10;
        }
    }
}
