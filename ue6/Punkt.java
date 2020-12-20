import java.math.*;

public final class Punkt{
    public final BigDecimal xStelle;
    public final BigDecimal yStelle;


    public Punkt (double anfang, double ende){
    xStelle = new BigDecimal(anfang);
    yStelle = new BigDecimal(ende);
   
    }


    public Punkt (BigDecimal anfang, BigDecimal ende){
        xStelle = anfang;
        yStelle = ende;
    }
    
    public String toString(){
    return "(" + xStelle.toString() + "," + yStelle.toString();
    }

    public BigDecimal abstand(Punkt other){
        BigDecimal x = other.xStelle.subtract(this.xStelle);
        BigDecimal y = other.yStelle.subtract(this.yStelle);
        BigDecimal sqr =x.pow(2).add(y.pow(2));
    
        return BigDecimalUtility.sqrt(sqr);
    }

}