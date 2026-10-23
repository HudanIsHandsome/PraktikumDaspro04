package JOBSHEET5;
import java.util.Scanner;

public class pemilihanif04{
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("====CETAK KRS SIAKAD====");
     System.out.println("APAKAH UKT SUDAH LUNAS?(TRUE / FALSE):");
   boolean bayar_ukt=sc.nextBoolean();
     if (bayar_ukt) {
      System.out.println("===PEMBAYARAN UKT TELAH LUNAS===");
      System.out.println("Silahkan Cetak KRS Dan Meminta TTD DPA.");
      }else{
      System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
 }

     

   
  



    }




}