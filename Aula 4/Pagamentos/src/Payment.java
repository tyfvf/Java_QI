public class Payment {
    private final double RATE_OF_CARD = 5.0;
    private double amount,amountPaid,subtotal;
    
    public Payment(double amount, double amountPaid){
    this.amount = amount;
    this.amountPaid = amountPaid;
}
    
    private double moneyChange(){
        return this.amountPaid - this.amount;
    }
    
    public double moneyPayment(){
        
        if(this.amountPaid > this.amount){
            return this.moneyChange();
        }
        subtotal = this.amount - this.amountPaid;
        return subtotal;
    }
    
    public boolean debitCardPayment(){
        this.amount += this.RATE_OF_CARD;
        updatePayment();
        return this.amountPaid == this.amount;
    }
    
    public boolean creditCardPayment(int numberOfInstallments){
        double valueOfRate = 0.02;
        double interestValue = this.amount *valueOfRate * numberOfInstallments;
        
        this.amount += interestValue;
        updatePayment();
        return this.amountPaid == this.amount;
        
    }
    private void updatePayment(){
        this.amountPaid = this.amount;
    }
    
}
