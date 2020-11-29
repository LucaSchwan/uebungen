public class HSeiteneffekte {
        public static void main(String[] args) {
                HWrapper w1 = new HWrapper();
                HWrapper w2 = new HWrapper();

                w1.i = 0;
                w2.i = 3;
                
                int[] a = { 1, 2 };

                f(a, w1, w2);
                int[] b = {2*a[0],2*a[1]};
                f(b, w1);
                f(a);
        }

        public static void f(int[] a, HWrapper... ws) {
                if(ws.length==0){
                        a = new int[2];
                        a[0] = 8;
                        a[1] = 9;
                }else{
                        a[1] += a[0];
                        ws[ws.length-1].i = a[0];
                        ws[0].i += ws[ws.length-1].i;
                }
                //Speicherzustand jeweils hier zeichnen
        }
}
