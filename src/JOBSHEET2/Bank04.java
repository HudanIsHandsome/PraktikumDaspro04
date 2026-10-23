package JOBSHEET2;
import java.util.Scanner;
public class Bank04 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;
        System.out.println("Masukkkan Jumlah Tabungan Awal Anda :");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan Lama Menabung Anda");
        lama_menabung = input.nextInt();
        bunga = lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir = bunga + jml_tabungan_awal;
        System.out.println("bunga Adalah : " + bunga);
    System.out.println("Jumlah Tabungan Akhir Adalah : " + jml_tabungan_akhir);
        input.close();



    }
}