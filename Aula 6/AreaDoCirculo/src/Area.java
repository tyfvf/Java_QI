
public class Area {
   public double raio;
   public double PI = 3.14;
   
   public Area(double raio){
       this.raio = raio;
   } 
   
   
   public double CalculoArea(){
       return  PI * (raio * raio);
      
   }
           
}
