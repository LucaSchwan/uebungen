public class Karte {
    public Farbe farbe;
    public Wert wert;


    public String toString(){
        return farbe.toString() +  wert.toString();
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
      
        fa = switch (f) {
            case "HERZ" -> Farbe.HERZ;
            case "KARO" -> Farbe.KARO;
            case "PIKE" -> Farbe.PIKE;
            case "KREUZ" -> Farbe.KREUZ;
            default -> Farbe.HERZ;
        }; 

        we = switch (w) {
            case "SIEBEN" -> Wert.SIEBEN;
            case "ACHT" -> Wert.ACHT;
            case "NEUN" -> Wert.NEUN;
            case "ZEHN" -> Wert.ZEHN;
            case "BUBE" -> Wert.BUBE;
            case "DAME" -> Wert.DAME;
            case "KOENIG" -> Wert.KOENIG;
            case "ASS" -> Wert.ASS;
            default -> Wert.ASS;
        }; 


        ausgabe.farbe = fa;
        ausgabe.wert = we;
        return ausgabe;
    }

    public static int kombinationen(){
        return Farbe.values().length * Wert.values().length;
    }
    

    public static Karte[] skatblatt(){
        int kombo = kombinationen();
        Karte [] deck = new Karte [kombo];
        int i = 0;

        for(Farbe p1 : Farbe.values()){
            for(Wert p : Wert.values()){
                Karte b = neueKarte(p1, p);
                deck[i] = b;
                i++;
            }

        }
        


        return deck;
    }

}
