public class Strahl extends Grade {
    Punkt p1;
    Punkt p2;
    final boolean p1Start;

    public Strahl(Punkt p0, Punkt p){
        super(p0, p);
        p1 = super.p1;
        p2 = super.p2;
        p1Start = true;
    }

    public boolean startsFromp1(){
        return p1Start;
    }

    public boolean startsFromp2(){
        return !p1Start;
    }

    public String toString(){
        if(p1Start){
            return "Strahl durch (" + p1.xStelle.toString() + "," +p1.yStelle.toString() + ") und (" +p2.xStelle.toString() + "," +p2.yStelle.toString() + "). Startpunkt ist Punkt 1";
        }
        return "Strahl durch (" + p1.xStelle.toString() + "," +p1.yStelle.toString() + ") und (" +p2.xStelle.toString() + "," +p2.yStelle.toString() + "). Startpunkt ist Punkt 2";
    }
}
