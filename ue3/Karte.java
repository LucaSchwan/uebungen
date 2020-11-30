public class Karte {
    public Farbe farbe;
    public Wert wert;


public String toString(Karte karte){
    String ausgabe = "";
    String ausFarbe = farbe.toString();
    String ausWert = wert.toString();
    ausgabe = ausFarbe + ausWert;
    return ausgabe;
}

public static Karte neueKarte(Farbe f, Wert w){
Karte ausgabe = new Karte();
ausgabe.farbe = f;
ausgabe.wert = w;
return ausgabe;
}

public static Karte neueKarte(String f, String w){
    Karte ausgabe = new Karte();
    Farbe fa = Farbe.HERZ;
    Wert we = Wert.ASS;
    if(f.equals("HERZ")){ 
        fa = Farbe.HERZ;}
    else{
        if(f.equals("KARO")){ 
            fa = Farbe.KARO;}
        else{
            if(f.equals("PIKE")){ 
                fa = Farbe.PIKE;}
            else{
                if(f.equals("KREUZ")){ 
                    fa = Farbe.KREUZ;}               
            }
        }
    }

    if(w.equals("ACHT")){ 
        we = Wert.ACHT;}
    else{
        if(w.equals("NEUN")){ 
            we = Wert.NEUN;}
        else{
            if(w.equals("ZEHN")){ 
                we = Wert.ZEHN;}
            else{
                if(f.equals("BUBE")){ 
                    we = Wert.BUBE;} 
                else{
                    if(f.equals("DAME")){ 
                        we = Wert.DAME;} 
                    else{
                        if(f.equals("KOENIG")){ 
                            we = Wert.KOENIG;} 
                        else{
                            if(f.equals("ASS")){ 
                                we = Wert.ASS;}                            
                        } 
                    } 
                }              
            }
        }
    }


    ausgabe.farbe = fa;
    ausgabe.wert = we;
    return ausgabe;
    }

}
