
public class SimpleInterest {
    private double interest,period,rate,capital;
    
    public SimpleInterest(double period, double capital, double rate){
        this.capital = capital;
        this.period = period;
        this.rate = rate;
        this.interestCalculator();
    }
    
    private void interestCalculator(){
        if(rate >= 1){
            rate = rate / 100;
        }
        interest = capital * rate * period;
    }
    
    public double amountCalculator(){
        return capital  + interest;
    }
    
    public double getInterest(){
        return this.interest
    }
}
