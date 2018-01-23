
public class BaconCheeseBurg extends Cheeseburg{
    double bacon;
    boolean extrab;
    
    public BaconCheeseBurg(){
        super();
        bacon=.75;
    }
    
    public double price(){
        double out=0;
        
        if(extra){
            out = (cheese*2) + bacon + price;
            if(extrab){
                out = out + (bacon*2);
            }
        }
        else if(extra==false && extrab==true){
            out = cheese + (bacon*2) + price;
        }
        
        else out = cheese + bacon + price;
        
        out = (out*TAX) + out;
        
        return out;
    }
}
