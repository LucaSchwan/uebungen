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

}
