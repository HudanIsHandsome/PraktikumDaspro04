//P ; 4
//B = 20 +(P mod 60) ; 24
 // B ; 24
 // B+15 ; 39 
 // B−8 ; 18
 // B+30 ; 54
 // B−20 ; 4
 // B+5 ; 29
package JOBSHEET12;

import java.util.Scanner;
import java.util.Arrays;

public class SearchNilaiParameter04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai = {24, 39, 18, 54, 4, 29};
        int key = 24;
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length - 1; i++) {
           for (int j = 0; j < nilai.length - 1 - i; j++) {
            if (nilai[j] > nilai[j + 1]) {
                int temp = nilai[j];
                nilai[j] = nilai[j + 1];
                nilai[j + 1] = temp;
            }
          }
        }
        System.out.println(Arrays.toString(nilai));
    }
}