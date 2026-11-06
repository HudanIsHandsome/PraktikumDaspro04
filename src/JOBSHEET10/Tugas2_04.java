//P = 4
//n = (5 + (4 mod 4))
package JOBSHEET10;

import java.util.Scanner;

public class Tugas2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int jumlahSeluruhAngka = 0; // Variabel untuk menghitung total jumlah seluruh angka pada tabel

        System.out.println("\nTabel Perkalian " + n + " x " + n + ":");

        // Outer loop untuk mengatur baris
        for (int i = 1; i <= n; i++) {
            // Inner loop untuk mengatur kolom
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;

                
                System.out.printf("%4d", hasil);
                
                // Menjumlahkan setiap hasil perkalian ke dalam total keseluruhan
                jumlahSeluruhAngka += hasil;
            }
            // Pindah ke baris baru setelah satu baris kolom yang baru selesai dicetak
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
    }
}
