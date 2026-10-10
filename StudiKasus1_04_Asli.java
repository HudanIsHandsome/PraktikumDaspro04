/**
 * KopiSenja
 */
package JOBSHEET6;
import java.util.Scanner;
public class StudiKasus1_04_Asli {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int HargaPerCup= 18000;
        int JumlahCup, UangBayar;
        int TotalHarga, Diskon, TotalBayar;
        int Kembalian, Kurang;

        System.out.println("Masukkan Jumlah Cup Yang Ingin Di Beli :");
        JumlahCup= sc.nextInt();

        System.out.println("MAsukkan Uang Pembayaran :");
        UangBayar= sc.nextInt();

        TotalHarga= JumlahCup * HargaPerCup;
        Diskon =0;
        

        if (TotalHarga>=100000) {
            Diskon= TotalHarga * 10 / 100;
        } else {
            Diskon = 0;
        }
        TotalBayar = TotalHarga - Diskon;

        System.out.println("Total Harga:"+ TotalHarga);
        System.out.println("Total Diskon"+ Diskon);
        System.out.println("Total Yang Harus Di Bayar"+ TotalBayar);

        if (UangBayar>= TotalBayar) {
            Kembalian = UangBayar - TotalBayar;
            System.out.println("Kembalian Anda Adalah"+ Kembalian);
        }else{ 
            Kurang = TotalBayar - UangBayar;
            System.out.println("Uang Yang Anda Bayar Kurang Sebesar" + Kurang);
        }
    }
}  
