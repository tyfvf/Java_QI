import java.util.ArrayList;

public class ShopList {
    private ArrayList <Product>shopList = new ArrayList<Product>();
    
    public boolean addItem(Product product){
        return shopList.add(product);
    }
    
    public int countItens(){
        return shopList.size();
    }
    
    public ArrayList<Product> getList(){
        return this.shopList;
    }
}
