
public class Main {
    public static void main(String[] args) {
        /*Kapsam scope = new Kapsam();
        
        scope.onileCarp();*/
        Kapsam2 kapsam2 = new Kapsam2();
        Kapsam2.DahiliClass kapsamDahiliClass = kapsam2.new DahiliClass();
        kapsamDahiliClass.onileCarp();
        kapsam2.dahiliClassKontrol();
        
    }
   
}
