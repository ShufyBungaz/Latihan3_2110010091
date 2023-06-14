
package geometri;

public class Lingkaran {
double bil1;

    public Lingkaran(double bil1) {
        this.bil1 = bil1;
    }
    
    double setLuas(){
       return 3.14* Math.pow(bil1, 2);
   }
     double setKeliling(){
       return 2*3.14*bil1;
   }
     
     public static void main(String[] args) {
        Lingkaran luas = new Lingkaran(1);
        Lingkaran keliling = new Lingkaran(1);
        
         System.out.println("Hasil    ="+luas.setLuas());
         System.out.println("Hasil   ="+keliling.setKeliling());
    }    
}
