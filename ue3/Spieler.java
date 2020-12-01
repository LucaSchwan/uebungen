public class Spieler {
    Karte [] kartenhand;
    String name;
    Double gewinnProzent;


    public static void main(String[] args){
        Karte [] k = new Karte[3];

        k[0].wert = Wert.SIEBEN;
        k[1].wert = Wert.NEUN;
        k[2].wert = Wert.KOENIG;
        k[0].farbe = Farbe.HERZ;
        k[1].farbe = Farbe.HERZ;
        k[2].farbe = Farbe.KARO;
        
        Spieler spieler1 = new Spieler();
        Spieler spieler2 = new Spieler();
        Spieler spieler3 = new Spieler();
        Spieler spieler4 = new Spieler();
        Spieler spieler5 = new Spieler();

        spieler1.name = "Elisabet";
        spieler2.name = "Klaus";
        spieler3.name = "Helmut";
        spieler4.name = "Erwin";

        spieler1.gewinnProzent = 37.5;
        spieler2.gewinnProzent = 12.5;
        spieler3.gewinnProzent = 38.75;
        spieler4.gewinnProzent = 11.25;

       spieler5 = besterSpieler(spieler1, spieler2, spieler3, spieler4);
       spieler5.kartenhand = k;
        Karte karte1 = new Karte();
        karte1.wert = Wert.BUBE;
        karte1.farbe = Farbe.KARO;

        spieler5.kannBedienen(karte1);
    }


    public String toString(){
        return name;
    }


    public static Spieler besterSpieler(Spieler...club){
        Spieler test = new Spieler();
        double[] g = new double[club.length];
        for(int i = 0; i < club.length; i++){
            g[i] = club[i].gewinnProzent;
        }
        sort(g);
        System.out.println(g);
        for(int o = 0; o < club.length; o++){
            if(club[o].gewinnProzent == g[0]){
                return club[0];
            }
        }
        return test;
    }


    public void kannBedienen(Karte k){
        boolean kannBedienen = false;
        String ausgabe = "";

        for(int i = 0; i<kartenhand.length; i++){
            if(kartenhand[i].bedient(k)){
                kannBedienen = true;
            }
        }
        ausgabe = kannBedienen ? name + " kann bedienen!" :  name + " kann nicht bedienen!";
        System.out.println(ausgabe);
    }


    public static void sort(double[] a) {
		//int [] a gegeben von Sort.java
        double z;
        int i,j;
		int n = a.length;
		
		for(i = 0; i < n-1; i++) {
			
			for (j = i+1; j < n; j++) {
				
				if (a[i] > a[j]) {
					z = a[i];
					a[i] = a[j];
					a[j] = z;
				}
			}
		}	
			
	}

}