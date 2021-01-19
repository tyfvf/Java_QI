
public class Valuator {
    private double number;
    
    public Valuator(double number){
        this.number = number;
        this.valuator();
                
    } 
    
    private void valuator(){
        if(number < 0){
            System.out.println("This number is negative");
        }
        else if(number == 0){
            System.out.println("This number is neutral");
        }
        else{
            System.out.println("This number is positive");
        }
    }
}
