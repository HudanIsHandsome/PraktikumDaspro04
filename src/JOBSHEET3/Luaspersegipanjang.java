package JOBSHEET3;
import java.util.Scanner;

public class Luaspersegipanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;
        System.out.println("Masukkan Panjang =");
        panjang =input.nextInt();
        System.out.println("Masukkan Lebar =");
        lebar =input.nextInt();
        luas =panjang*lebar;
        System.out.println("Luas Persegi adalah =" + luas);

        input.close();

    }
}
