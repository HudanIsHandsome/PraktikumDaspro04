package JOBSHEET3;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
    Scanner arga= new Scanner(System.in);
    int banyaklembar;
    int biayacetak=500;
    int biayajilid=5000;
    int totharga;
    
    System.out.println("Banyak Lembar :");
    banyaklembar=arga.nextInt();

    totharga=banyaklembar*biayacetak+biayajilid;
    System.out.println("Total HArga Yang Harus Dibayar Adalah RP = " + totharga);

    
    
    
    
    }

}
