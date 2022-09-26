
public class Kapsam {
    private int privateDegisken = 30;
    
    public Kapsam(){
        System.out.println("privateDegisken = " + privateDegisken);
    }
    
    public void onileCarp(){
        int privateDegisken = 10;
       
        for ( int i = 1; i<6 ; i++){
            System.out.println(i + "*" + this.privateDegisken + " = " + (i * this.privateDegisken));
        }
    }
    
}
