package JOBSHEET9;
import java.util.Scanner;

public class KafeDoWhile04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan;
        int hargaKopi = 10000 + (4 % 5)* 1000, hargaTeh = 5000 + (4 % 4)* 1000, hargaRoti = 15000 + (4 % 6)* 1000, kopi, teh, roti;
        double totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar)   : ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Masukkan jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah teh : ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah roti : ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang dibayar : " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai");

    }
}