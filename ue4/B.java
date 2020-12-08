public class B{
        public  static void main (String [] args){
            B b = new B ();
            b.a (Long.valueOf(100));
            b.a (Double.valueOf(100));
            b.a (Integer.valueOf(100));
            double r1 = b.b (100D);
            int r2 = (int) b.b (100);
            c(Integer.valueOf(100), "0");
            c(100L,"0");
            c(100L,'0');
        }

public void a (int p) {
    System.out.println("   a  1   ");
}

public void a (double p){
    System.out.println(   "   a  2   "   );
}

public void a   (Double p) {
  System.out.println(   "   a  3   "   );
}

public int b   (double p) {
    System.out.println(   "   b  1   "   );
    return 0;
}

public double b   (int p){
    System.out.println(   "   b  2   "   );
    return 0;
}

public static void c   (Long p1,int p2){
    System.out.println(   "   c  1   "   );
}

public static void c (long p1,String p2) {
    System.out.println(   "   c  2   "   );
}

public static void c (Long p1, String p2)  {
    System.out.println ("c3")  ;
}
}