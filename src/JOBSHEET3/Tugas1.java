/**
 * Tugas1
 */
package JOBSHEET3;
import java.util.Scanner;
public class Tugas1 {
        public static void main(String[] args) {
            Scanner arga = new Scanner(System.in);
            int hargalaptop;
            int uangmuka;
            int sisaharga;
            int lamabulancicilan;
            double bungabulanan=0.02;
            double totalcicilan;

            System.out.println("Masukkan Harga laptop =");
            hargalaptop=arga.nextInt();
            System.out.println("Masukkan Uang Muka");
            uangmuka=arga.nextInt();
            System.out.println("Lama cicilan");
            lamabulancicilan=arga.nextInt();

            sisaharga=hargalaptop-uangmuka;
            bungabulanan=sisaharga*0.02;
            totalcicilan=bungabulanan*lamabulancicilan;
            System.out.println("Total Cicilan Anda Adalah RP" + totalcicilan);

        }

    
}
    

