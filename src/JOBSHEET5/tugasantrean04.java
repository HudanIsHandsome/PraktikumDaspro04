package JOBSHEET5;
import java.util.Scanner;

public class tugasantrean04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kode;
        System.out.println("==== LAYANAN AKADEMI KAMPUS ====");
        System.out.println("     MASUUKKAN NOMER KODE       ");
        kode=sc.nextInt();
        switch (kode){
            case 1:
                System.out.println("LOKET A");
                System.out.println("LAYANAN LEGALISIR IJAZAH");
                break;
            case 2 :
                System.out.println("LOKET B");
                System.out.println("LAYANAN SURAT KETERANGAN AKTIF KULIAH");
                break;
            case 3:
                System.out.println("LOKET c");    
                System.out.println("LAYANAN PEMBAYARAN UKT");
                break; 
            case 4:
                System.out.println("LOKET D");       
                System.out.println("LAYANAN PENGAJUAN CUTI AKADEMIK");   
                break;
            default:
                System.out.println("KODE LAYANAN TIDAK TERSEDIA.");   
                break;  
    
        }
    }
}
