
public class Produto {
    //attribute
    
    public String name;
    public double priceOfBuy;
    public double percentOfGain;
    public double priceOfSale;
    
    //Method
    public void calculatePriceOfSale(){
        priceOfSale = priceOfBuy * percentOfGain +priceOfBuy;
    }
}
