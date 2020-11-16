public class ZinsesZins_Rechner {
  
  public static void main(String []args) {

	double startBetrag = SimpleIO.getDouble("Bitte geben Sie den Startbetrag ein.");
	
	double zinsen = 0;
	while(zinsen==0) {
	zinsen = SimpleIO.getDouble("Bitte geben Sie den Zinssatz als Prozentwert ein.") / 100; //divided by 100 to get percentage
	}
    
    String wahl = SimpleIO.getString("Bitte waehlen Sie aus: \n Ziel: \n Berechnet die Zeit, bis ein gegebener Betrag angespart wurde. \n Zeit: \n Berechnet den Betrag, der nach einer gegebenen Zeit angespart wurde.");

    switch(wahl) {
      case "Ziel" -> zielRechnung(startBetrag, zinsen);
      case "Zeit" -> zeitRechnung(startBetrag, zinsen);
      default -> SimpleIO.output("Sie haben keinen erlaubten Befehl eingegeben", "error-400 bad request");
    }
  }

  static void zielRechnung(double startBetrag, double zinsen) {
    double zielBetrag = SimpleIO.getDouble("Bitte geben Sie den Zielbetrag ein.");
    
    if(startBetrag<zielBetrag&&zinsen>0) {
    	  double finalBetrag = startBetrag;
    	    int jahre = 0;

    	    while(finalBetrag < zielBetrag) {
    	      finalBetrag += (finalBetrag *= zinsen);
    	      jahre++;
    	    }

    	    SimpleIO.output("Es dauert " + jahre + " Jahre bei einem Zinssatz von " + zinsen * 100 + "%, um von " + startBetrag + " auf den Betrag " + zielBetrag + " zu sparen. \n  Nach dieser Zeit hat man " + finalBetrag +  ".", "Ergenbis");
    }
    else {
    	 if(startBetrag>zielBetrag&&zinsen<0) {
    	  	  double finalBetrag = startBetrag;
    	  	    int jahre = 0;

    	  	    while(finalBetrag < zielBetrag) {
    	  	      finalBetrag += (finalBetrag *= zinsen);
    	  	      jahre++;
    	  	    }

    	  	    SimpleIO.output("Es dauert " + jahre + " Jahre bei einem Zinssatz von " + zinsen * 100 + "%, um von " + startBetrag + " auf den Betrag " + zielBetrag + " zu sparen. \n  Nach dieser Zeit hat man " + finalBetrag +  ".", "Ergenbis");
    	  }
    	  else {
    	  	SimpleIO.output("Der Zielbetrag kann nicht erreicht werden.", "error-403 forbidden");
    	  }
    }   
  }

  static void zeitRechnung(double startBetrag, double zinsen) {
    int jahre = SimpleIO.getInt("Bitte geben sie an wieviele Jahre gespart werden soll.");
    double finalBetrag = startBetrag;

    for (int i = 0; i < jahre; i++) {
      finalBetrag += (finalBetrag *= zinsen);
    }

    SimpleIO.output("Bei einem Zinssatz von " + zinsen +  "% und einem Startbetrag von " + startBetrag + " hat man nach " + jahre + " Jahren " + finalBetrag + " gespart.", "Ergenbis");
  }
}