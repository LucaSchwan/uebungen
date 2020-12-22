public class Strecke extends Strahl {
    
    public Strecke(Punkt p0, Punkt p3){
        super(p0,p3);
    }

    public String toString(){
        return "Strecke von (" + p1.xStelle.toString() + "," +p1.yStelle.toString() + ") zu (" +p2.xStelle.toString() + "," +p2.yStelle.toString() + ")";
    }

    public boolean enthaelt(Punkt p0){
            if(zwischenp1p2(p0)){
                return true;
            }
            return false;
    }

    public boolean equals(Object obj){      
        Strecke strecke = (Strecke) obj;
        if(this.p1 == strecke.p1&&this.p2 == strecke.p2){
             return true;
        }        
        return false;
    }

    public Strahl verlaengern(boolean swap){
        return new Strahl(p1,p2,swap);
    }
}