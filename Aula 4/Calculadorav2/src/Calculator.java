public class Calculator {
    //Atributos
    private double number1,number2;
    
    public Calculator(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    //Metodos / Funções
    public double Sum(){
        return number1+number2;
    }
    
    public double Subtract(){
        return number1-number2;
    }
    
    public double Multiply(){
        return number1*number2;
    }
    
    public double Division(){
        return number1/number2;
    }
}
