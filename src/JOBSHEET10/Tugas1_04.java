//P = 4
//n = (6 + (4 mod 5))
package JOBSHEET10;

import java.util.Scanner;

public class Tugas1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int totalAngka = 0; 

        // Outer loop untuk mengatur baris (dari 1 sampai n)
        for (int i = 1; i <= n; i++) {
            // Inner loop untuk mencetak angka dari 1 sampai i pada setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++; 
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak: " + totalAngka);

    }
}
