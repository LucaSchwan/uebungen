public class Spieler {
    Karte [] kartenhand;
    String name;
    Double gewinnProzent;

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
