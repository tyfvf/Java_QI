
public class Inventory {
    private int numberOfItens;
    private final int MAX_ITENS;
    
    public Inventory(int numberOfItens){
        MAX_ITENS = numberOfItens;
    }
    
    public boolean addItem(int numberOfItens){
        int numberActual = this.numberOfItens + numberOfItens;
        
        if(numberActual <= MAX_ITENS){
            this.numberOfItens += numberOfItens;
            return true;
        }
        return false;
    }
}
