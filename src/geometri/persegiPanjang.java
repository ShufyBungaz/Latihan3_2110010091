
package geometri;

public class persegiPanjang {
    double bil1, bil2;

    public persegiPanjang(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    double setLuas(){
       return bil1 * bil2;
   }
     double setKeliling(){
       return 2*(bil1+bil2);
   }
     
     public static void main(String[] args) {
        persegiPanjang luas = new persegiPanjang(9,1);
        persegiPanjang keliling = new persegiPanjang(9,1);
        
         System.out.println("Hasil    ="+luas.setLuas());
         System.out.println("Hasil P  ="+keliling.setKeliling());
    }
}
