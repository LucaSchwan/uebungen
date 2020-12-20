import java.math.*;

public final class Punkt{
    public  BigDecimal aPunkt;
    public  BigDecimal ePunkt;


public Punkt (double anfang, double ende){
   aPunkt = new BigDecimal(anfang);
   ePunkt = new BigDecimal(ende);
   
}


public Punkt (BigDecimal anfang, BigDecimal ende){
    aPunkt = anfang;
    ePunkt = ende;
 }
    
public String toString(){
return "(" + aPunkt.toString() + "," + ePunkt.toString();
}

}