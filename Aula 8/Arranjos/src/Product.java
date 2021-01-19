class Product {
//atributos 
private String description;
private float price;
private int quantity;

public Product(String description, float price,int quantity){
    this.description = description;
    this.price = price;
    this.quantity = quantity;
}

    public String getDescription() {
        return description;
    }
    public float getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

}
