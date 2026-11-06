// P = 4
// n = (2 + (4 mod 3))
// n = (4 + (4 mod 3))
// n = (5 + (4 mod 3))
// n = (2 + (4 mod 3))

package JOBSHEET10;

import java.util.Scanner;

public class Rectangle04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Baris: ");
        int baris = sc.nextInt();

        System.out.print("Masukkan Jumlah Kolom: ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
