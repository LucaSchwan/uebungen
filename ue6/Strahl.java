public class Strahl extends Grade {
    final boolean p1Start;

    public Strahl(Punkt p0, Punkt p){
        super(p0, p);
        p1Start = true;
    }

    public Strahl(Punkt p0, Punkt p, boolean richtung){
        super(p0, p);
        p1Start = richtung;
    }

    public boolean startsFromp1(){
        return p1Start;
    }

    public boolean startsFromp2(){
        return !p1Start;
    }

    public String toString(){
        if(p1Start){
            return "Strahl von (" + p1.xStelle.toString() + "," +p1.yStelle.toString() + ") durch (" +p2.xStelle.toString() + "," +p2.yStelle.toString() + ")";
        }
        return "Strahl durch (" + p1.xStelle.toString() + "," +p1.yStelle.toString() + ") von (" +p2.xStelle.toString() + "," +p2.yStelle.toString() + ")";
    }

    public Grade verlaengern(){
        return new Grade(p1,p2);
    }

    public boolean enthaelt(Punkt p0){
        if(p1Start){
            if(zwischenp1p2(p0)||hinterp2(p0)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(zwischenp1p2(p0)||vorp1(p0)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public boolean equals(Object obj){
        if(super.equals(obj)){
            Strahl strahl = (Strahl) obj;
            if(p1Start == strahl.p1Start){
                return true;
            }
        }
        return false;
    }
}
