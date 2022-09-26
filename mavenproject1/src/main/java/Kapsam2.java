
public class Kapsam2{
    private int privateDegisken = 30;
    
    public Kapsam2(){
        
    }
    public void dahiliClassKontrol(){
        DahiliClass d = new DahiliClass();
        System.out.println("value is " + d.a);
    }
    public class DahiliClass{
        private int privateDegisken = 20;
        private int a = 4;
        public void onileCarp(){
        int privateDegisken = 10;
        for ( int i = 1; i< 6 ; i++){
            System.out.println(i + "*" + Kapsam2.this.privateDegisken + " = " + (i * Kapsam2.this.privateDegisken));
        }
    }
        
    }
}

