
public class Converter {
    public double FahrenheitConverter(double Celsius){
        return 1.8 * Celsius + 32;
        
    } 
    
    public double KelvinConverter(double Celsius) {
        return Celsius + 273;
    }
    
    public double RankineConverter(double Celsius) {
        return Celsius * 1.8 + 491.67;
    }
}
