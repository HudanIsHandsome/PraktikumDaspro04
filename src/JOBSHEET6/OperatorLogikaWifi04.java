package JOBSHEET6;
import java.util.Scanner;

public class OperatorLogikaWifi04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         boolean mahasiswa;
        boolean dosen;
        boolean akunDiBlokir;

        System.out.println("APAKAH PENGGUNA MAHASISWA?");
        mahasiswa= sc.nextBoolean();
        System.out.println("APAKAH PENGGUNA DOSEN?");
        dosen= sc.nextBoolean();
        System.out.println("APAKAH AKUN SEDANG DI BLOKIR?");
        akunDiBlokir= sc.nextBoolean();
        
        if ((mahasiswa && dosen) && !akunDiBlokir) {
            System.out.println("AKSES WIFI DI BERIKAN");
        } else {
            System.out.println("AKSES WIFI DITOLAK");
        }
    } 
    
}          

