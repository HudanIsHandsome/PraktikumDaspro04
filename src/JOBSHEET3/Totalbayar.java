package JOBSHEET3;
import java.util.Scanner;

public class Totalbayar {
    public static void main(String[] args) {
        Scanner arga = new Scanner(System.in);
        Double harga;
        double potongan;
        double jml_bayar;
        double diskon =0.15;

        System.out.println("Masukkan Harga =");
        harga=arga.nextDouble();

        potongan =diskon*harga;
        jml_bayar=harga-potongan;
        System.out.println("Biaya Yang Harus Anda Bayar Adalah RP ="  +jml_bayar);

        arga.close(); 
    }
    
}
