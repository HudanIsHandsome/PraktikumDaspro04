package JOBSHEET2;
import java.util.Scanner;

public class StudiKasusSatu04 {

    public static void main(String[] args) {
        Scanner arga = new Scanner(System.in);
        int gajiPokok, jumlahAnak, besarTunjangan, totalTunjangan;
        double totalPotongan, gajiBersih, potonganPensiun = 0.10;
        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = arga.nextInt();
         System.out.print("Masukkan Jumlah Anak: ");
        jumlahAnak = arga.nextInt();

        System.out.print("Masukkan Besar Tunjangan: ");
        besarTunjangan = arga.nextInt();
        totalTunjangan = besarTunjangan * jumlahAnak;
        totalPotongan = gajiPokok * potonganPensiun;
        gajiBersih = gajiPokok - totalPotongan + totalTunjangan;

        System.out.println("Gaji bersih anda adalah: " + gajiBersih);
        arga.close();

    }
}