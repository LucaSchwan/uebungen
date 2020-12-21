import java.math.BigDecimal;

public final class Grade {
    
    public final Punkt p1;    
    public final Punkt p2;

    public Grade(Punkt übergabe1, Punkt übergabe2){
        if(!BigDecimalUtility.equalValues(übergabe1.xStelle, übergabe2.xStelle)&&!BigDecimalUtility.equalValues(übergabe1.yStelle, übergabe2.yStelle)){
            if(BigDecimalUtility.equalValues(übergabe1.xStelle, übergabe2.xStelle)){
                if(übergabe1.yStelle.compareTo(übergabe2.yStelle) < 0 ){
                    p1 = übergabe1;
                    p2 = übergabe2;
                }
                else{
                    p1 = übergabe2;
                    p2 = übergabe1;
                }
            }
            else{
                if(übergabe1.xStelle.compareTo(übergabe2.xStelle) < 0 ){
                    p1 = übergabe1;
                    p2 = übergabe2;
                }
                else{
                    p1 = übergabe2;
                    p2 = übergabe1;
                }
            }
        }
        else{
            p1 = null;
            p2 = null;
        }
    }

    public String toString(){
        return "Gerade durch (" + p1.xStelle.toString() + "," +p1.yStelle.toString() + ") und (" +p2.xStelle.toString() + "," +p2.yStelle.toString() + ")";
    }

    private boolean zwischenp1p2(Punkt p0){
        if(BigDecimalUtility.equalValues(p0.xStelle, p1.xStelle)&&BigDecimalUtility.equalValues(p0.yStelle, p1.yStelle)||BigDecimalUtility.equalValues(p0.xStelle, p2.xStelle)&&BigDecimalUtility.equalValues(p0.yStelle, p2.yStelle)){
            return true;
        }
        else{
            BigDecimal aStrecke = BigDecimalUtility.sqrt(p0.xStelle.subtract(p1.xStelle).pow(2).add(p0.yStelle.subtract(p1.yStelle).pow(2)));
            BigDecimal bStrecke = BigDecimalUtility.sqrt(p0.xStelle.subtract(p2.xStelle).pow(2).add(p0.yStelle.subtract(p2.yStelle).pow(2)));
            BigDecimal cStrecke = BigDecimalUtility.sqrt(p1.xStelle.subtract(p2.xStelle).pow(2).add(p1.yStelle.subtract(p2.yStelle).pow(2)));
            if(BigDecimalUtility.equalValues(aStrecke.add(bStrecke), cStrecke)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    private boolean vorp1(Punkt p0){

    }

    private boolean hinterp2(Punkt p0){

    }

}