package JOBSHEET6;
import java.util.Scanner;

public class NestedAksesLab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.println("Apakah Kamu Mahasiswa Aktif?");
        mahasiswaAktif=sc.nextBoolean();
        System.out.println("Apakah Kamu Sedang Mendapat Sanksi?");
        sedangDisanksi=sc.nextBoolean();
        System.out.println("Apakah Kamu Memiliki Izin Dosen?");
        punyaIzinDosen=sc.nextBoolean();
        System.out.println("Apakah Kamu Asisten Lab?");
        asistenLab=sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi  ){
            if (punyaIzinDosen || asistenLab) {
    System.out.println("Akses laboratorium diberikan");
    } else {
        System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
    } else {
         System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
                }
            }
        }
    