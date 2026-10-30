// P = 4
// n = (3 + (4 mod 5)) = 7
// n = (9 + (4 mod 5)) = 13
package JOBSHEET10;
import java.util.Scanner;

public class star04Parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Masukkan Nilai n = ");
       int n = sc.nextInt();

       for (int i = 1; i <= n; i++) {
            System.out.print("*");
         }
         System.out.println();
       sc.close();
    }
    
}