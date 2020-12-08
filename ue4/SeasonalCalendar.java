public class SeasonalCalendar {
    Product[] product;


    public SeasonalCalendar(Product[] p){
        product = p;
    }

    public int getLongestProductName (){
        int ausgabe = 0;
        for(int i = 0; i < product.length; i++){
            if(product[i].getName().length() > ausgabe){
                ausgabe = product[i].getName().length();
            }
        }
        return ausgabe;
    }

    public String pad(String s, int i, char c){
       StringBuilder str = new StringBuilder(s);

       while(str.length() < i){
        str.append(c);
       }

       s = str.toString();
        return s;
    }


    public String stringify(){
        String monate = pad("", getLongestProductName(), ' ') + "  JFMAMJJASOND";
        StringBuilder str = new StringBuilder(monate + System.lineSeparator());

        for(int i = 0; i<product.length; i++){
            String name = pad(product[i].getName(), getLongestProductName(), ' ');
            String regional = product[i].stringifyIsRegional();
            String importProdukt = "  " + product[i].stringifyIsImported();
            str.append(name + ": " + regional + System.lineSeparator() + pad("", getLongestProductName(), ' ') + importProdukt + System.lineSeparator());          
        }
        return str.toString();
    }


}
