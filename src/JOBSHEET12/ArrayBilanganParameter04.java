//P ; 4
// P+8 ; 12 
//−(1+(P mod 7)) ; -5
//20+(P mod 15) ; 24
package JOBSHEET12;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBilanganParameter04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] bil = new int[4];

        bil[0] = 4;
        bil[1] = 12;
        bil[2] = -5;
        bil[3] = 24;

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}