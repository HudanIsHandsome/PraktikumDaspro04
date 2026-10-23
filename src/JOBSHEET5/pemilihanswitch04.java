package JOBSHEET5;
import java.util.Scanner;

public class pemilihanswitch04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semester;
        
         System.out.println("====CETAK KRS SIAKAD====");
         System.out.println("MASUKKAN SEMESTER ");   
        semester=sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS SEMESTER 1 DITAMPILKAN");
                break;
            case 2:
                System.out.println("KRS SEMESTER 2 DITAMPILKAN");
                break;
            case 3:
                System.out.println("KRS SEMESTER 3 DITAMPILKAN");
                break;
            case 4:
                System.out.println("KRS SEMESTER 4 DITAMPILKAN");
            case 5:
                System.out.println("KRS SEMESTER 5 DITAMPILKAN");
                break;
            case 6:
                System.out.println("KRS SEMESTER 6 DITAMPILKAN");
                break;
            case 7:
                System.out.println("KRS SEMESTER 7 DITAMPILKAN");
                break;
            case 8:
                System.out.println("KRS SEMESTER 8 DITAMPILKAN");
                break;
        
          
        }
    }
}