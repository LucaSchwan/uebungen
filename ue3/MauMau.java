public class MauMau {

    
public static void main(String[] args){
   Spieler test = new Spieler();   
   test.gewinnProzent = 12.5;
   Spieler test2 = new Spieler();   
   test2.gewinnProzent = 2.8;
   Spieler test3 = new Spieler();   
   test3.gewinnProzent = 2.0;
   Spieler test4 = new Spieler();   
   test4.gewinnProzent = 4.6;
  
    Spieler.besterSpieler(test, test2, test3, test4);
    
}
}