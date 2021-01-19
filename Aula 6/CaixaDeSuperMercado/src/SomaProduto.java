
public class SomaProduto {

    private double subtotal = 0;

    public double AddItem(double price) {
        return subtotal += price;
    }
    
    public double getSubtotal(){
        return this.subtotal;
    }

}
