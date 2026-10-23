package JOBSHEET6;
import java.util.Scanner;

public class TugasSeleksiAsisten04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        double nilaiDaspro=75 + (4 % 11);
        boolean sertifikatKompetensi;
        double nilaiWawancara=70 + (4 % 11); 

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang mendapat sanksi akademik? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        nilaiDaspro = sc.nextDouble();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        sertifikatKompetensi = sc.nextBoolean();

        System.out.print("Masukkan nilai wawancara: ");
        nilaiWawancara = sc.nextDouble();


        if (mahasiswaAktif && !sedangDisanksi) {

            if (nilaiDaspro >= 79 || sertifikatKompetensi) {

                if (nilaiWawancara >= 74) {
                    System.out.println("SELAMAT!");
                    System.out.println("Mahasiswa diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Gagal pada tahap wawancara.");
                    System.out.println("Nilai wawancara minimal adalah 75.");
                }

            } else {
                System.out.println("Gagal pada tahap akademik.");
                System.out.println(
                    "Nilai Dasar Pemrograman minimal 80 atau harus memiliki sertifikat kompetensi."
                );
            }

        } else {
            System.out.println("Gagal pada tahap administrasi.");

            if (!mahasiswaAktif) {
                System.out.println("Status mahasiswa tidak aktif.");
            }

            if (sedangDisanksi) {
                System.out.println("Mahasiswa sedang mendapatkan sanksi akademik.");
            }
        }

    }
}