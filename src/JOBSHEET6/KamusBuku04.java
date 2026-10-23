package JOBSHEET6;
import java.util.Scanner;
public class KamusBuku04 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("jenis buku:");
    String jenis= sc.nextLine();
    System.out.println("jumlah buku:");
    int jumlah= sc.nextInt();
    
    int diskonbukukamus=8 + (4 % 5);
    int diskonbukunovel=5 + (4 % 4);
    int diskonselainkeduabuku=3 + (4 % 4);
    int diskon;

    if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah > 2 +(4 % 2)) {
                diskon = diskonbukukamus + 2;
            } else {
                diskon = diskonbukukamus;
            }
        } 
        else if (jenis.equalsIgnoreCase("novel")) {
            if (jumlah > 3 +(4 % 2)) {
                diskon = diskonbukunovel + 2;
            } else {
                diskon = diskonbukunovel + 1;
            }
        } 
        else {
            if (jumlah > 3 + (4 % 2)) {
                diskon = diskonselainkeduabuku;
            } else {
                diskon = 0;
            }
        }
    System.out.println("kamu beli "+ jumlah+jenis +" jadi dapet diskon "+diskon+" %");
    }
}