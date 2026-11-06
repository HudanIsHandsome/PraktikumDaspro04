// P = 4
// n = (2 + (4 mod 3))
package JOBSHEET10;

import java.util.Scanner;

public class Triangle04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai n: ");
        int n = sc.nextInt();

        int i = 1;
       // while (i <= n){
          //  int j = 0;
           // while (j < i){
          //  System.out.print("*");
          //  j++;
          //  }System.out.println();
          //   i++;
      //  }
        i = n;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
         sc.close();
    }
    
}
