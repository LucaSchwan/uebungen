public class MauMau {

    
public static void main(String[] args){
    Farbe f1 = Farbe.KREUZ;
    Wert w1 = Wert.ACHT;
    Karte k1 = Karte.neueKarte(f1, w1);
   
    String ausgabe = k1.toString();
    java.lang.System.out.print(ausgabe);
    java.lang.System.out.print("ausgabe");
}
}
