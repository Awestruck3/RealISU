
public class Cheeseburg extends FoodItem {
    
    double cheese;
    boolean extra;
    
    public Cheeseburg(){
        super();
        cheese = 0.5;
    }
    
    public double price(){
        double out=0;
        
        if(extra){
            out = (cheese*2) + price;
        }
        else out = cheese + price;
        
        out = (out*TAX) + out;
        
        return out;
    }

    
}
