// P=4 
// 8 + (P mod 5) = 12 
//  55 + (p mod 11) = 59
package JOBSHEET9;
import java.util.Scanner;

public class SiakadFor04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double nilai, terendah= 0, tertinggi= 100;
        int batasNilaiLulus = 59;
        int jmlMahasiswaLulus= 0;
        int jmlMahasiswaTidakLulus= 0;

        for (int i=1; i <=12;  i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke " + i + " : ");
            nilai = sc.nextDouble();
            if (nilai >  tertinggi) {
                tertinggi = nilai ;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
             if (nilai >= batasNilaiLulus) {
                System.out.println("Mahasiswa Ke" +  i + " Dinyatakan Lulus");
                jmlMahasiswaLulus++;
            } else {
                System.out.println("Mahasiswa Ke" +  i + " Dinyatakan Tidak Lulus");
                jmlMahasiswaTidakLulus++;
            }       
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Yang Memenuhi KKM dan Lulus :" +  jmlMahasiswaLulus  + "Mahasiswa");
        System.out.println("Jumlah Mahasiswa Yang Tidak Memenuhi KKM dan Tidak Lulus :" +  jmlMahasiswaTidakLulus  + "Mahasiswa");

    }
}
