
public class Calculator {
    private double number1,number2;
    
    public Calculator(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    
    public double sum(){
        return this.number1 + this.number2;
}
    public double subtract(){
        return this.number1 - this.number2;
}
    public double multiply(){
        return this.number1 * this.number2;
    }
    
    public double division(){
        return this.number1 / this.number2;
    }
    
    public void setNumber1(double value){
        this.number1 = value;
    }
    
    public void setNumber2(double value){
        this.number2 = value;
    }
    }
