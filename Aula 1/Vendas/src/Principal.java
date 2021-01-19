
public class Principal {
    public static void main(String[] args) {
    Produto p1 = new Produto();
    Produto p2 = new Produto();
    
    //Produto1
    p1.name= "Massa isabela";
    p1.percentOfGain = 0.3; //30%
    p1.priceOfBuy = 1.50;
    p1.calculatePriceOfSale();
    
    
        System.out.printf("O preço do produto %s é de R$ %.2f\n",p1.name,p1.priceOfSale); 
    }
}



