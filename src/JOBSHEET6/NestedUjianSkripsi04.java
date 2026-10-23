package JOBSHEET6;
import java.util.Scanner;
/**
 * NestedUjianSkripsi04
 */
// P1 = 6 + (4 % 5) = 4 + 6 = 10
// P2 = 3 + (4 % 3) = 1 + 3 = 4
public class NestedUjianSkripsi04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         String pesan;
        int bimbinganP1, bimbinganP2;
        System.out.print("APAKAH MAHASISWA SUDAH BEBAS KOMPEN? (YA/TIDAK) :");
        String bebasKompen=sc.nextLine().trim();
        System.out.println("MASUKKAN JUMLAH LOG BIMBINGAN PEMBIMBING 1 :");
        bimbinganP1=sc.nextInt();
        System.out.println("MASUKKAN JUMLAH LOG BIMBINGAN PEMBIMBING 2 :");
        bimbinganP2=sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
          if (bimbinganP1 >=10 && bimbinganP2 >=4){
            pesan ="SEMUA SYARAT TERPENUHI. MAHASISWA BOLEH MENDAFTAR UJIAN SKRIPSI";
          }else if (bimbinganP1 < 10 && bimbinganP2 <4){
            pesan = "GAGAL! LOG BIMBINGAN P1 BELUM MENCAPAI 8 KALI DAN P2 KURANG DARI 4 KALI";
          }else if (bimbinganP1 <10){
            pesan = "GAGAL! LOG BIMBINGAN P1 BELUM MENCAPAI 8 KALI";
          } else {
            pesan = "GAGAL! LOG BIMBINGAN P2 BELUM MENCAPAI 4 KALI";
          }
        } else {
            pesan = "GAGAL! MAHASISWA MASIH MEMILIKI TANGGUNGAN KOMPEN";
        }
        System.out.println(pesan);
        

  }
}  