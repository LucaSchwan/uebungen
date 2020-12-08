public class test{

    public static void main(String[] arg){
        int x = 0;
        String ziel = "Hallo";
        x = 5*5;
        
       x = SimpleIO.getInt("Gib eine Zahl ein: ");
 
        if(ziel.equals("Zeit")){
            System.out.println(x);
        }
        else{
            System.out.println("x ist 5");
        }
    }
}
