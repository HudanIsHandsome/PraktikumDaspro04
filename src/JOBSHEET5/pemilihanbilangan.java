package JOBSHEET5;
import java.util.Scanner;

public class pemilihanbilangan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
    

        System.out.println("MASUKKAN ANGKA =");
        angka=sc.nextInt();

        if (angka %2==0)
        {
            System.out.println("ANGKA"+ angka + "TERMASUK BILANGAN GENAP");
        }
        else
        {
            System.out.println("ANGKA" + angka + "TERMASUK BILANGAN GANJIL");
            
        }    
    }

}