/**
 * Klasse zum arbeiten mit Produkten, sowie SeasonalCalendars. 
 * 
 * @author Luca Schwan, Robert Joel
 * @version 1.0
 * @since 08-12-2020
 * 
*/

public class Launcher {
    
    public static void main(String[] args){
        Product product1 = new Product("Apfel", "111111001111", "111111111111");
        Product product2 = new Product("Banane", "000000000000", "111111111111");
        Product product3 = new Product("Erdbeere", "000011100000", "000110000000");

        Product[] productArray = new Product[3];
        productArray[0] = product1;
        productArray[1] = product2;
        productArray[2] = product3;

        SeasonalCalendar kalender = new SeasonalCalendar(productArray);
        System.out.println(kalender.stringify());
    }

}
